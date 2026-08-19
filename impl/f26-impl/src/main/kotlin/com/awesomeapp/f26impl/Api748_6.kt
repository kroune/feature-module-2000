package com.awesomeapp.f26impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api748_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api748_6 API"
    }
}
