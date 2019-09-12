package com.xiangrui.doge.dogekt.modules

import com.fasterxml.jackson.databind.SerializationFeature
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.CallLogging
import io.ktor.features.ContentNegotiation
import io.ktor.jackson.jackson
import org.slf4j.event.Level
import java.text.DateFormat

fun Application.module() {
    install(ContentNegotiation) {
        jackson {
            configure(SerializationFeature.INDENT_OUTPUT, true)
            dateFormat = DateFormat.getDateInstance()
        }
    }

    logging()
}