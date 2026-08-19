package com.awesomeapp.f357api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api440_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api440_6 API"
    }
}
