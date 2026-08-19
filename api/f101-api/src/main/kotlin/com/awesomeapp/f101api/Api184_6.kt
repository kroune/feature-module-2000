package com.awesomeapp.f101api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api184_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api184_6 API"
    }
}
