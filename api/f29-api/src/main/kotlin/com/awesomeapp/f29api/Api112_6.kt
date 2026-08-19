package com.awesomeapp.f29api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api112_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api112_6 API"
    }
}
