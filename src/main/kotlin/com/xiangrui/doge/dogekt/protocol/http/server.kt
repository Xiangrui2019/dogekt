package com.xiangrui.doge.dogekt.protocol.http

import com.xiangrui.doge.dogekt.routers.router
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.jackson.jackson
import io.ktor.routing.routing
import java.text.DateFormat

fun Application.server() {
    install(ContentNegotiation) {
        jackson {
            dateFormat = DateFormat.getDateInstance()
        }
    }

    routing {
        router()
    }
}
