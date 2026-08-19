package com.awesomeapp.f533api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api616_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api616_6 API"
    }
}
