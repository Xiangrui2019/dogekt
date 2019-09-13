package com.xiangrui.doge.dogekt.models

import com.xiangrui.doge.dogekt.conf.env
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.StdOutSqlLogger
import org.jetbrains.exposed.sql.addLogger
import org.jetbrains.exposed.sql.transactions.transaction

fun ConnectDatabase() {
    Database.connect(
        env?.get("MYSQL_DSN")!!,
        "com.mysql.cj.jdbc.Driver",
        env?.get("MYSQL_USER")!!,
        env?.get("MYSQL_PASS")!!)

    if (env?.get("KTOR_MODE")!! == "debug") {
        transaction {
            addLogger(StdOutSqlLogger)
        }
    }

    MigrationModels()
}
