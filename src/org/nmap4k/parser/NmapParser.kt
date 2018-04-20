package org.nmap4k.parser

import org.nmap4k.model.NmapResult
import java.util.regex.Pattern

internal class NmapParser {

    companion object {
        fun parse(output: String): List<NmapResult> {
            val pattern = Pattern.compile("\\n[\\n]+")
            val result = output.split(pattern)

            print(result.size)
            return emptyList()
        }
    }
}
