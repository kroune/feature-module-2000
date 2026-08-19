package com.awesomeapp.f337api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api420_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api420_6 API"
    }
}
