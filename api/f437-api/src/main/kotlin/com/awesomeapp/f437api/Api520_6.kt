package com.awesomeapp.f437api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api520_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api520_6 API"
    }
}
