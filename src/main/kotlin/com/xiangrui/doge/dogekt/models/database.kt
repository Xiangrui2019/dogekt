package com.xiangrui.doge.dogekt.models

import com.xiangrui.doge.dogekt.conf.env
import org.jetbrains.exposed.sql.Database

fun ConnectDatabase() {
    Database.connect(env?.get("MYSQL_DSN")!!, "",
        env?.get("MYSQL_USER")!!, env?.get("MYSQL_PASS")!!)

    MigrationModels()
}
