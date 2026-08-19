package com.awesomeapp.f129api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api212_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api212_6 API"
    }
}
