package com.awesomeapp.f37api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api120_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api120_6 API"
    }
}
