package com.awesomeapp.f25api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api108_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api108_6 API"
    }
}
