package com.xiangrui.doge.dogekt.api

import com.xiangrui.doge.dogekt.services.UserLoginService
import io.ktor.routing.Route
import io.ktor.routing.post

fun Route.register() {
    post("/user/register") {
    }
}

fun Route.login() {
    post<UserLoginService>("/user/login") {
        it.Login()
    }
}
