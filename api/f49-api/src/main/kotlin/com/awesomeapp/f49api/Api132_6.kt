package com.awesomeapp.f49api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api132_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api132_6 API"
    }
}
