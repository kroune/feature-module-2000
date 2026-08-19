package com.awesomeapp.f45api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api128_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api128_6 API"
    }
}
