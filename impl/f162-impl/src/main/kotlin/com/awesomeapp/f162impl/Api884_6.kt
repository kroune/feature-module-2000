package com.awesomeapp.f162impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api884_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api884_6 API"
    }
}
