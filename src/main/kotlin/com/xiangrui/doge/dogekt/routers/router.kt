package com.xiangrui.doge.dogekt.routers

import com.xiangrui.doge.dogekt.api.login
import com.xiangrui.doge.dogekt.api.ping
import com.xiangrui.doge.dogekt.api.register
import io.ktor.application.install
import io.ktor.routing.Route
import io.ktor.routing.route

fun Route.router() {
    route("/api/v1") {
        ping()
        register()
        login()

        route("/") {
        }
    }
}
