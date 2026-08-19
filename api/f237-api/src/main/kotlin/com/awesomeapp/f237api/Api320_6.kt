package com.awesomeapp.f237api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api320_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api320_6 API"
    }
}
