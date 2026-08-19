package com.awesomeapp.f405api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api488_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api488_6 API"
    }
}
