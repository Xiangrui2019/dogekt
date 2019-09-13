package com.xiangrui.doge.dogekt.models

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.jetbrains.exposed.sql.SchemaUtils

fun MigrationModels() {
    SchemaUtils.create(User)
}