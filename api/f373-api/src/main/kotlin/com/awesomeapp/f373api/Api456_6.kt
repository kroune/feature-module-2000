package com.awesomeapp.f373api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api456_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api456_6 API"
    }
}
