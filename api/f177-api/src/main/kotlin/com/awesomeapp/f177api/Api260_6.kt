package com.awesomeapp.f177api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api260_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api260_6 API"
    }
}
