package org.nmap4k.model

data class NmapResult(
        var ip: String,
        var latency: Double,
        var closedPorts: Int,
        var lines: List<NmapResultLine>
)

data class NmapResultLine(
        var port:Int,
        var protocol: String,
        var state: String,
        var service: String
)