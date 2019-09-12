package com.xiangrui.doge.dogekt.models

import org.jetbrains.exposed.sql.Table

object User : Table() {
    val id = integer("id").autoIncrement().primaryKey()
}