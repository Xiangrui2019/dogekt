package com.xiangrui.doge.dogekt

import com.xiangrui.doge.dogekt.conf.Load
import com.xiangrui.doge.dogekt.conf.env
import com.xiangrui.doge.dogekt.protocol.http.server
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main(args: Array<String>) {
    Load()

    val server = env?.get("ADDR")?.toInt()?.let {
        embeddedServer(Netty, it) {
            server()
        }
    }

    server?.start(wait = true)
}
