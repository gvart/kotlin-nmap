package org.nmap4k

import org.nmap4k.model.NmapResult
import org.nmap4k.parser.NmapParser
import java.io.ByteArrayOutputStream

class Nmap(private val bin: String) {

    private val parser: NmapParser = NmapParser()

    fun execute(): NmapResult? {
       // var exec = Runtime.getRuntime().exec("$bin 192.168.16.1/24")

       // var result = exec.inputStream.reader().readText()

        NmapParser.parse("\n" +
                "Starting Nmap 7.01 ( https://nmap.org ) at 2018-04-20 16:58 EEST\n" +
                "Nmap scan report for gateway.lan.local (192.168.16.1)\n" +
                "Host is up (0.0076s latency).\n" +
                "Not shown: 991 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "21/tcp   open  ftp\n" +
                "22/tcp   open  ssh\n" +
                "23/tcp   open  telnet\n" +
                "53/tcp   open  domain\n" +
                "80/tcp   open  http\n" +
                "443/tcp  open  https\n" +
                "1723/tcp open  pptp\n" +
                "2000/tcp open  cisco-sccp\n" +
                "8291/tcp open  unknown\n" +
                "\n" +
                "Nmap scan report for 192.168.16.5\n" +
                "Host is up (0.017s latency).\n" +
                "All 1000 scanned ports on 192.168.16.5 are closed\n" +
                "\n" +
                "Nmap scan report for 192.168.16.9\n" +
                "Host is up (0.0079s latency).\n" +
                "Not shown: 996 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "80/tcp   open  http\n" +
                "5432/tcp open  postgresql\n" +
                "8080/tcp open  http-proxy\n" +
                "\n" +
                "Nmap scan report for 192.168.16.11\n" +
                "Host is up (0.0052s latency).\n" +
                "Not shown: 999 closed ports\n" +
                "PORT   STATE SERVICE\n" +
                "22/tcp open  ssh\n" +
                "\n" +
                "Nmap scan report for 192.168.16.13\n" +
                "Host is up (0.0057s latency).\n" +
                "Not shown: 998 closed ports\n" +
                "PORT   STATE SERVICE\n" +
                "22/tcp open  ssh\n" +
                "80/tcp open  http\n" +
                "\n" +
                "Nmap scan report for 192.168.16.15\n" +
                "Host is up (0.0035s latency).\n" +
                "Not shown: 980 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "5001/tcp open  commplex-link\n" +
                "5002/tcp open  rfe\n" +
                "5003/tcp open  filemaker\n" +
                "5004/tcp open  avt-profile-1\n" +
                "5009/tcp open  airport-admin\n" +
                "5030/tcp open  surfpass\n" +
                "5033/tcp open  unknown\n" +
                "5050/tcp open  mmcc\n" +
                "5051/tcp open  ida-agent\n" +
                "5054/tcp open  rlm-admin\n" +
                "5060/tcp open  sip\n" +
                "5061/tcp open  sip-tls\n" +
                "5080/tcp open  onscreen\n" +
                "5087/tcp open  unknown\n" +
                "5100/tcp open  admd\n" +
                "5101/tcp open  admdog\n" +
                "5102/tcp open  admeng\n" +
                "5120/tcp open  unknown\n" +
                "8082/tcp open  blackice-alerts\n" +
                "\n" +
                "Nmap scan report for 192.168.16.26\n" +
                "Host is up (0.027s latency).\n" +
                "Not shown: 998 filtered ports\n" +
                "PORT    STATE SERVICE\n" +
                "80/tcp  open  http\n" +
                "443/tcp open  https\n" +
                "\n" +
                "Nmap scan report for 192.168.16.41\n" +
                "Host is up (0.012s latency).\n" +
                "Not shown: 998 closed ports\n" +
                "PORT   STATE SERVICE\n" +
                "22/tcp open  ssh\n" +
                "80/tcp open  http\n" +
                "\n" +
                "Nmap scan report for 192.168.16.42\n" +
                "Host is up (0.0078s latency).\n" +
                "Not shown: 995 filtered ports\n" +
                "PORT      STATE SERVICE\n" +
                "80/tcp    open  http\n" +
                "135/tcp   open  msrpc\n" +
                "445/tcp   open  microsoft-ds\n" +
                "3389/tcp  open  ms-wbt-server\n" +
                "49154/tcp open  unknown\n" +
                "\n" +
                "Nmap scan report for 192.168.16.44\n" +
                "Host is up (0.0053s latency).\n" +
                "Not shown: 997 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "3389/tcp open  ms-wbt-server\n" +
                "5555/tcp open  freeciv\n" +
                "\n" +
                "Nmap scan report for 192.168.16.45\n" +
                "Host is up (0.00058s latency).\n" +
                "Not shown: 996 closed ports\n" +
                "PORT      STATE SERVICE\n" +
                "22/tcp    open  ssh\n" +
                "5432/tcp  open  postgresql\n" +
                "9000/tcp  open  cslistener\n" +
                "32768/tcp open  filenet-tms\n" +
                "\n" +
                "Nmap scan report for 192.168.16.48\n" +
                "Host is up (0.0037s latency).\n" +
                "Not shown: 996 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "80/tcp   open  http\n" +
                "5432/tcp open  postgresql\n" +
                "8080/tcp open  http-proxy\n" +
                "\n" +
                "Nmap scan report for 192.168.16.50\n" +
                "Host is up (0.0055s latency).\n" +
                "Not shown: 996 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "80/tcp   open  http\n" +
                "8090/tcp open  unknown\n" +
                "8888/tcp open  sun-answerbook\n" +
                "\n" +
                "Nmap scan report for 192.168.16.66\n" +
                "Host is up (0.0073s latency).\n" +
                "All 1000 scanned ports on 192.168.16.66 are closed\n" +
                "\n" +
                "Nmap scan report for 192.168.16.70\n" +
                "Host is up (0.0097s latency).\n" +
                "Not shown: 994 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "80/tcp   open  http\n" +
                "135/tcp  open  msrpc\n" +
                "139/tcp  open  netbios-ssn\n" +
                "443/tcp  open  https\n" +
                "445/tcp  open  microsoft-ds\n" +
                "3389/tcp open  ms-wbt-server\n" +
                "\n" +
                "Nmap scan report for 192.168.16.73\n" +
                "Host is up (0.0074s latency).\n" +
                "Not shown: 998 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "5432/tcp open  postgresql\n" +
                "\n" +
                "Nmap scan report for 192.168.16.76\n" +
                "Host is up (0.041s latency).\n" +
                "Not shown: 995 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "80/tcp   open  http\n" +
                "8080/tcp open  http-proxy\n" +
                "8088/tcp open  radan-http\n" +
                "8089/tcp open  unknown\n" +
                "8090/tcp open  unknown\n" +
                "\n" +
                "Nmap scan report for 192.168.16.85\n" +
                "Host is up (0.0054s latency).\n" +
                "Not shown: 997 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "8080/tcp open  http-proxy\n" +
                "8085/tcp open  unknown\n" +
                "\n" +
                "Nmap scan report for 192.168.16.86\n" +
                "Host is up (0.014s latency).\n" +
                "Not shown: 995 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "111/tcp  open  rpcbind\n" +
                "139/tcp  open  netbios-ssn\n" +
                "445/tcp  open  microsoft-ds\n" +
                "8080/tcp open  http-proxy\n" +
                "\n" +
                "Nmap scan report for 192.168.16.93\n" +
                "Host is up (0.028s latency).\n" +
                "All 1000 scanned ports on 192.168.16.93 are closed\n" +
                "\n" +
                "Nmap scan report for 192.168.16.94\n" +
                "Host is up (0.0079s latency).\n" +
                "Not shown: 998 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "8080/tcp open  http-proxy\n" +
                "\n" +
                "Nmap scan report for 192.168.16.95\n" +
                "Host is up (0.034s latency).\n" +
                "All 1000 scanned ports on 192.168.16.95 are closed\n" +
                "\n" +
                "Nmap scan report for 192.168.16.96\n" +
                "Host is up (0.020s latency).\n" +
                "All 1000 scanned ports on 192.168.16.96 are closed\n" +
                "\n" +
                "Nmap scan report for 192.168.16.104\n" +
                "Host is up (0.0063s latency).\n" +
                "Not shown: 998 closed ports\n" +
                "PORT      STATE SERVICE\n" +
                "80/tcp    open  http\n" +
                "49152/tcp open  unknown\n" +
                "\n" +
                "Nmap scan report for 192.168.16.105\n" +
                "Host is up (0.0038s latency).\n" +
                "Not shown: 994 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "80/tcp   open  http\n" +
                "139/tcp  open  netbios-ssn\n" +
                "445/tcp  open  microsoft-ds\n" +
                "2000/tcp open  cisco-sccp\n" +
                "5060/tcp open  sip\n" +
                "\n" +
                "Nmap scan report for 192.168.16.109\n" +
                "Host is up (0.0077s latency).\n" +
                "Not shown: 999 closed ports\n" +
                "PORT   STATE SERVICE\n" +
                "80/tcp open  http\n" +
                "\n" +
                "Nmap scan report for 192.168.16.114\n" +
                "Host is up (0.0096s latency).\n" +
                "Not shown: 997 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "80/tcp   open  http\n" +
                "82/tcp   open  xfer\n" +
                "5432/tcp open  postgresql\n" +
                "\n" +
                "Nmap scan report for 192.168.16.120\n" +
                "Host is up (0.0085s latency).\n" +
                "Not shown: 997 closed ports\n" +
                "PORT    STATE SERVICE\n" +
                "22/tcp  open  ssh\n" +
                "80/tcp  open  http\n" +
                "443/tcp open  https\n" +
                "\n" +
                "Nmap scan report for 192.168.16.129\n" +
                "Host is up (0.0061s latency).\n" +
                "Not shown: 998 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "8080/tcp open  http-proxy\n" +
                "\n" +
                "Nmap scan report for 192.168.16.138\n" +
                "Host is up (0.0061s latency).\n" +
                "Not shown: 997 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "111/tcp  open  rpcbind\n" +
                "2049/tcp open  nfs\n" +
                "\n" +
                "Nmap scan report for 192.168.16.139\n" +
                "Host is up (0.0060s latency).\n" +
                "Not shown: 995 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "80/tcp   open  http\n" +
                "111/tcp  open  rpcbind\n" +
                "443/tcp  open  https\n" +
                "8080/tcp open  http-proxy\n" +
                "\n" +
                "Nmap scan report for 192.168.16.140\n" +
                "Host is up (0.0058s latency).\n" +
                "Not shown: 996 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "80/tcp   open  http\n" +
                "443/tcp  open  https\n" +
                "8080/tcp open  http-proxy\n" +
                "\n" +
                "Nmap scan report for 192.168.16.141\n" +
                "Host is up (0.011s latency).\n" +
                "Not shown: 996 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "80/tcp   open  http\n" +
                "443/tcp  open  https\n" +
                "8080/tcp open  http-proxy\n" +
                "\n" +
                "Nmap scan report for 192.168.16.142\n" +
                "Host is up (0.013s latency).\n" +
                "Not shown: 996 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "80/tcp   open  http\n" +
                "443/tcp  open  https\n" +
                "8080/tcp open  http-proxy\n" +
                "\n" +
                "Nmap scan report for 192.168.16.146\n" +
                "Host is up (0.0082s latency).\n" +
                "Not shown: 988 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "25/tcp   open  smtp\n" +
                "49/tcp   open  tacacs\n" +
                "80/tcp   open  http\n" +
                "646/tcp  open  ldp\n" +
                "700/tcp  open  epp\n" +
                "714/tcp  open  iris-xpcs\n" +
                "2000/tcp open  cisco-sccp\n" +
                "5060/tcp open  sip\n" +
                "5432/tcp open  postgresql\n" +
                "8083/tcp open  us-srv\n" +
                "9000/tcp open  cslistener\n" +
                "\n" +
                "Nmap scan report for 192.168.16.199\n" +
                "Host is up (0.0057s latency).\n" +
                "Not shown: 996 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "80/tcp   open  http\n" +
                "443/tcp  open  https\n" +
                "2000/tcp open  cisco-sccp\n" +
                "\n" +
                "Nmap scan report for 192.168.16.200\n" +
                "Host is up (0.0067s latency).\n" +
                "Not shown: 996 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "80/tcp   open  http\n" +
                "443/tcp  open  https\n" +
                "2068/tcp open  avocentkvm\n" +
                "\n" +
                "Nmap scan report for 192.168.16.201\n" +
                "Host is up (0.0057s latency).\n" +
                "Not shown: 995 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "80/tcp   open  http\n" +
                "443/tcp  open  https\n" +
                "2068/tcp open  avocentkvm\n" +
                "8022/tcp open  oa-system\n" +
                "\n" +
                "Nmap scan report for 192.168.16.202\n" +
                "Host is up (0.0051s latency).\n" +
                "Not shown: 984 closed ports\n" +
                "PORT      STATE SERVICE\n" +
                "111/tcp   open  rpcbind\n" +
                "135/tcp   open  msrpc\n" +
                "139/tcp   open  netbios-ssn\n" +
                "445/tcp   open  microsoft-ds\n" +
                "2179/tcp  open  vmrdp\n" +
                "3389/tcp  open  ms-wbt-server\n" +
                "8009/tcp  open  ajp13\n" +
                "8080/tcp  open  http-proxy\n" +
                "8443/tcp  open  https-alt\n" +
                "49155/tcp open  unknown\n" +
                "49156/tcp open  unknown\n" +
                "49157/tcp open  unknown\n" +
                "49158/tcp open  unknown\n" +
                "49159/tcp open  unknown\n" +
                "49165/tcp open  unknown\n" +
                "49167/tcp open  unknown\n" +
                "\n" +
                "Nmap scan report for 192.168.16.203\n" +
                "Host is up (0.0086s latency).\n" +
                "Not shown: 987 closed ports\n" +
                "PORT      STATE SERVICE\n" +
                "135/tcp   open  msrpc\n" +
                "139/tcp   open  netbios-ssn\n" +
                "445/tcp   open  microsoft-ds\n" +
                "808/tcp   open  ccproxy-http\n" +
                "2179/tcp  open  vmrdp\n" +
                "3389/tcp  open  ms-wbt-server\n" +
                "49155/tcp open  unknown\n" +
                "49156/tcp open  unknown\n" +
                "49157/tcp open  unknown\n" +
                "49158/tcp open  unknown\n" +
                "49160/tcp open  unknown\n" +
                "49161/tcp open  unknown\n" +
                "49175/tcp open  unknown\n" +
                "\n" +
                "Nmap scan report for 192.168.16.205\n" +
                "Host is up (0.0045s latency).\n" +
                "Not shown: 987 closed ports\n" +
                "PORT      STATE SERVICE\n" +
                "135/tcp   open  msrpc\n" +
                "139/tcp   open  netbios-ssn\n" +
                "445/tcp   open  microsoft-ds\n" +
                "808/tcp   open  ccproxy-http\n" +
                "2179/tcp  open  vmrdp\n" +
                "3389/tcp  open  ms-wbt-server\n" +
                "49155/tcp open  unknown\n" +
                "49156/tcp open  unknown\n" +
                "49157/tcp open  unknown\n" +
                "49158/tcp open  unknown\n" +
                "49160/tcp open  unknown\n" +
                "49161/tcp open  unknown\n" +
                "49175/tcp open  unknown\n" +
                "\n" +
                "Nmap scan report for 192.168.16.209\n" +
                "Host is up (0.0071s latency).\n" +
                "Not shown: 999 closed ports\n" +
                "PORT   STATE SERVICE\n" +
                "22/tcp open  ssh\n" +
                "\n" +
                "Nmap scan report for 192.168.16.215\n" +
                "Host is up (0.0096s latency).\n" +
                "Not shown: 996 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "80/tcp   open  http\n" +
                "5432/tcp open  postgresql\n" +
                "9000/tcp open  cslistener\n" +
                "\n" +
                "Nmap scan report for 192.168.16.217\n" +
                "Host is up (0.013s latency).\n" +
                "Not shown: 990 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "80/tcp   open  http\n" +
                "5432/tcp open  postgresql\n" +
                "8080/tcp open  http-proxy\n" +
                "8081/tcp open  blackice-icecap\n" +
                "8082/tcp open  blackice-alerts\n" +
                "8083/tcp open  us-srv\n" +
                "8084/tcp open  unknown\n" +
                "8085/tcp open  unknown\n" +
                "8888/tcp open  sun-answerbook\n" +
                "\n" +
                "Nmap scan report for 192.168.16.223\n" +
                "Host is up (0.0068s latency).\n" +
                "Not shown: 995 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "80/tcp   open  http\n" +
                "81/tcp   open  hosts2-ns\n" +
                "5432/tcp open  postgresql\n" +
                "8080/tcp open  http-proxy\n" +
                "\n" +
                "Nmap scan report for 192.168.16.226\n" +
                "Host is up (0.0092s latency).\n" +
                "Not shown: 996 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "5432/tcp open  postgresql\n" +
                "8009/tcp open  ajp13\n" +
                "8080/tcp open  http-proxy\n" +
                "\n" +
                "Nmap scan report for 192.168.16.230\n" +
                "Host is up (0.0059s latency).\n" +
                "Not shown: 999 closed ports\n" +
                "PORT   STATE SERVICE\n" +
                "80/tcp open  http\n" +
                "\n" +
                "Nmap scan report for 192.168.16.231\n" +
                "Host is up (0.0060s latency).\n" +
                "Not shown: 998 closed ports\n" +
                "PORT     STATE SERVICE\n" +
                "22/tcp   open  ssh\n" +
                "5432/tcp open  postgresql\n" +
                "\n" +
                "Nmap scan report for 192.168.16.250\n" +
                "Host is up (0.0065s latency).\n" +
                "Not shown: 999 closed ports\n" +
                "PORT   STATE SERVICE\n" +
                "22/tcp open  ssh\n" +
                "\n" +
                "Nmap scan report for 192.168.16.251\n" +
                "Host is up (0.0036s latency).\n" +
                "Not shown: 982 closed ports\n" +
                "PORT     STATE    SERVICE\n" +
                "22/tcp   open     ssh\n" +
                "80/tcp   open     http\n" +
                "81/tcp   open     hosts2-ns\n" +
                "99/tcp   filtered metagram\n" +
                "389/tcp  open     ldap\n" +
                "443/tcp  open     https\n" +
                "500/tcp  filtered isakmp\n" +
                "880/tcp  filtered unknown\n" +
                "999/tcp  open     garcon\n" +
                "1433/tcp filtered ms-sql-s\n" +
                "2222/tcp open     EtherNetIP-1\n" +
                "5000/tcp open     upnp\n" +
                "5432/tcp open     postgresql\n" +
                "7778/tcp filtered interwise\n" +
                "8080/tcp open     http-proxy\n" +
                "8090/tcp open     unknown\n" +
                "8180/tcp open     unknown\n" +
                "8888/tcp open     sun-answerbook\n" +
                "\n" +
                "Nmap done: 256 IP addresses (50 hosts up) scanned in 43.23 seconds")
       // println(result)
        return null
    }
}