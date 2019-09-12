package com.xiangrui.doge.dogekt.api

import io.ktor.routing.Route
import io.ktor.routing.post

fun Route.register() {
    post("/user/register") {
    }
}

fun Route.login() {
    post("/user/login") {
    }
}
