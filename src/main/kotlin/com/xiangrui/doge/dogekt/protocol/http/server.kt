package com.xiangrui.doge.dogekt.protocol.http

import com.fasterxml.jackson.databind.SerializationFeature
import com.xiangrui.doge.dogekt.modules.module
import com.xiangrui.doge.dogekt.routers.router
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.CallLogging
import io.ktor.features.ContentNegotiation
import io.ktor.jackson.jackson
import io.ktor.routing.routing
import org.slf4j.event.Level
import java.text.DateFormat

fun Application.server() {
    module()

    routing {
        router()
    }
}
