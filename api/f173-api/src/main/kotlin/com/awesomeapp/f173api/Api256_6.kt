package com.awesomeapp.f173api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api256_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api256_6 API"
    }
}
