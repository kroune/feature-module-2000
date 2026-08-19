package com.awesomeapp.f521api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api604_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api604_6 API"
    }
}
