package com.awesomeapp.f313api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api396_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api396_6 API"
    }
}
