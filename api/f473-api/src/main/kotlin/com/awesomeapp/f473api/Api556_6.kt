package com.awesomeapp.f473api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api556_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api556_6 API"
    }
}
