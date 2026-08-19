package com.awesomeapp.f261api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api344_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api344_6 API"
    }
}
