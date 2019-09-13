package com.xiangrui.doge.dogekt.api

import com.xiangrui.doge.dogekt.models.Users
import com.xiangrui.doge.dogekt.serializer.Response
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.routing.Route
import io.ktor.routing.get
import io.ktor.routing.post
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction

fun Route.ping() {
    post("/ping") {
        context.respond(HttpStatusCode.OK, Response(200, "Pong"))
    }
}
