package com.awesomeapp.f513api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api596_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api596_6 API"
    }
}
