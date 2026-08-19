package com.awesomeapp.f461api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api544_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api544_6 API"
    }
}
