package com.awesomeapp.f557api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api640_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api640_6 API"
    }
}
