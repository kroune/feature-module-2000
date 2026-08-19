package com.awesomeapp.f441api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api524_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api524_6 API"
    }
}
