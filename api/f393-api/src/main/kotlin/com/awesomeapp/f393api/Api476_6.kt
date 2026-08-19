package com.awesomeapp.f393api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api476_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api476_6 API"
    }
}
