package com.xiangrui.doge.dogekt.models

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.TransactionManager
import org.jetbrains.exposed.sql.transactions.transaction

fun MigrationModels() {
    transaction {
        SchemaUtils.createMissingTablesAndColumns(Users)
    }
}
