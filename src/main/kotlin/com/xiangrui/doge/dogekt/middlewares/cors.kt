package com.xiangrui.doge.dogekt.middlewares

import com.xiangrui.doge.dogekt.conf.env
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.client.request.request
import io.ktor.features.CORS
import io.ktor.http.HttpMethod
import io.ktor.routing.Route

fun Route.Cors() {
    install(CORS) {
        method(HttpMethod.Get)
        method(HttpMethod.Post)
        method(HttpMethod.Put)
        method(HttpMethod.Patch)
        method(HttpMethod.Delete)
        method(HttpMethod.Head)

        if (env?.get("KTOR_MODE")!! == "debug") {
            anyHost()
        } else {
            host(env?.get("CORS_DOMAIN")!!)
        }

        allowCredentials = true
        allowNonSimpleContentTypes = true
    }
}
