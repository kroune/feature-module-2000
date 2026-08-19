package com.awesomeapp.f377api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api460_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api460_6 API"
    }
}
