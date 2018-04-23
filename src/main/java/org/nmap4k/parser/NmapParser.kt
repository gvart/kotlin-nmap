package org.nmap4k.parser

import org.nmap4k.model.NmapRun

import java.io.File
import javax.xml.bind.JAXBContext

internal class NmapParser {
    companion object {
        fun parse(outputFilePath: String): NmapRun {
            val content = File(outputFilePath).readText()
            val jaxbContext = JAXBContext.newInstance(NmapRun::class.java)
            val unmarshaller = jaxbContext.createUnmarshaller()

            return content.reader().use {
                unmarshaller.unmarshal(it) as NmapRun
            }
        }
    }
}
