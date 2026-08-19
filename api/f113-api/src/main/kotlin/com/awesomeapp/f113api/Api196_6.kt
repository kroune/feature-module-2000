package com.awesomeapp.f113api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api196_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api196_6 API"
    }
}
