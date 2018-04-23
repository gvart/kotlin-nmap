package org.nmap4k


import org.nmap4k.model.NmapRun
import org.nmap4k.model.VersionIntensity
import org.nmap4k.parser.NmapParser

class Nmap(private val bin: String) {

    private val parameters = mutableMapOf<String, String>()
    private val outputFilePath = "/tmp/nmapResult.xml"

    fun execute(): NmapRun {
        val execution = Runtime.getRuntime().exec("$bin ${build()} -oX $outputFilePath")
        execution.waitFor()
        return NmapParser.parse(outputFilePath)
    }

    /**
     * -iL <inputfilename>: Input from list of hosts/networks
     * */
    fun sourceFromFile(filePath: String): Nmap {
        parameters["-iL"] = filePath
        return this
    }

    fun include(vararg hosts: String): Nmap {
        parameters["hosts"] = hosts.joinToString(separator = " ")
        return this
    }
    /**
     * --exclude <host1[,host2][,host3],...>: Exclude hosts/networks
     * */
    fun exclude(vararg hosts: String): Nmap {
        parameters["--exclude"] = hosts.joinToString(separator = ",")
        return this
    }

    /**
     *  Only scan specified ports
     *  Ex: -p22; -p1-65535; -p U:53,111,137,T:21-25,80,139,8080,S:9
     * */
    fun ports(start: Int, end: Int = -1): Nmap {
        parameters["-p"] = if(end == -1) start.toString() else  "$start-$end"
        return this
    }

    fun versionIntensity(level: VersionIntensity): Nmap {
        parameters["--version-intensity"] = level.level.toString()
        return this
    }

    fun parameter(key: String, value: String = ""): Nmap {
        parameters[key.trim()] = value
        return this
    }

    fun clear() {
        parameters.clear()
    }

    private fun build():String {
        val hosts = parameters["hosts"]

        var line = ""
        if(hosts != null) {
            parameters.remove("hosts")

            parameters.forEach { key, value ->
                line += "$key $value "
            }
            parameters["hosts"] = hosts

            line+=hosts

            return line
        }

        throw Exception("Hosts not set.")
    }
}