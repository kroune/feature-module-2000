package com.awesomeapp.f401api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api484_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api484_6 API"
    }
}
