package com.awesomeapp.f289api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api372_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api372_6 API"
    }
}
