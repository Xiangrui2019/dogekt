package com.xiangrui.doge.dogekt.routers

import com.xiangrui.doge.dogekt.api.main
import io.ktor.routing.Route
import io.ktor.routing.route

fun Route.router() {
    route("/api/v1") {
        main()
    }
}
