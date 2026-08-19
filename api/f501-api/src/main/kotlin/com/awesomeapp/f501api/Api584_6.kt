package com.awesomeapp.f501api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api584_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api584_6 API"
    }
}
