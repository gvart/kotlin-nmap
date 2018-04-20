package org.nmap4k

fun main(args: Array<String>) {

    val nmap = Nmap("/usr/bin/nmap")
    nmap.execute()
}