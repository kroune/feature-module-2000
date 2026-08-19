package com.awesomeapp.f297api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api380_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api380_6 API"
    }
}
