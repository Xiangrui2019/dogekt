package com.xiangrui.doge.dogekt.conf

import io.github.cdimascio.dotenv.Dotenv

var env: Dotenv? = null

fun Load() {
    env = Dotenv.load()
}
