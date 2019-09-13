package com.xiangrui.doge.dogekt.models

import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.stringLiteral

const val Active = "active"
const val Inactive = "inactive"
const val Suspend = "suspend"

object User : Table() {
    val id = integer("id").autoIncrement().primaryKey()
    val phone_number = varchar("phone_number", length = 155)
    val password = varchar("password", length = 100)
    val nick_name = varchar("nick_name", length = 155)
    val bio = varchar("bio", length = 155)
    val status = varchar("status", length = 40)
    val avatar = varchar("avatar", length = 155)
}
