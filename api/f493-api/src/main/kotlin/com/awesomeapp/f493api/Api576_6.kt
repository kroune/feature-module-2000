package com.awesomeapp.f493api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api576_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api576_6 API"
    }
}
