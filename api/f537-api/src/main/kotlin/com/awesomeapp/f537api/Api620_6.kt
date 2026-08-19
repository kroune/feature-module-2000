package com.awesomeapp.f537api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api620_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api620_6 API"
    }
}
