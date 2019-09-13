package com.xiangrui.doge.dogekt.models

import org.jetbrains.exposed.dao.*
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.stringLiteral

const val Active = "active"
const val Inactive = "inactive"
const val Suspend = "suspend"

object Users : IntIdTable() {
    val phone_number = varchar("phone_number", length = 155)
    val password = varchar("password", length = 100)
    val nick_name = varchar("nick_name", length = 155)
    val bio = varchar("bio", length = 155)
    val role = varchar("role", length = 40)
    val status = varchar("status", length = 40)
    val avatar = varchar("avatar", length = 155)
}
