package com.xiangrui.doge.dogekt.models

import org.jetbrains.exposed.sql.SchemaUtils

fun MigrationModels() {
    SchemaUtils.create(User)
}