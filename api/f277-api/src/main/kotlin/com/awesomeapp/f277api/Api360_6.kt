package com.awesomeapp.f277api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api360_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api360_6 API"
    }
}
