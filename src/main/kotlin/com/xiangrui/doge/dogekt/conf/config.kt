package com.xiangrui.doge.dogekt.conf

import com.xiangrui.doge.dogekt.models.ConnectDatabase
import io.github.cdimascio.dotenv.Dotenv

var env: Dotenv? = null

fun Load() {
    env = Dotenv.load()

    ConnectDatabase()
}
