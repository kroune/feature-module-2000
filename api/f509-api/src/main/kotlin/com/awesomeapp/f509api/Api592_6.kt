package com.awesomeapp.f509api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api592_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api592_6 API"
    }
}
