//package org.nmap4k
//
//import org.nmap4k.model.VersionIntensity
//
//fun main(args: Array<String>) {
//    val nmap = Nmap("/usr/bin/nmap").include("192.168.16.1/24").versionIntensity(VersionIntensity.LEVEL_3)
//    println("Initialized")
//    val result = nmap.execute()
//    println("Executed")
//    println(result.args)
//    println(result)
//
//    result.host.forEach {
//        println(it.address)
//        println("________")
//        it.ports?.port?.forEach { println(it) }
//    }
//
//    println("End")
//}