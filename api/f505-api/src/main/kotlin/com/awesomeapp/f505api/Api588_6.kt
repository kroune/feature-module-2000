package com.awesomeapp.f505api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api588_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api588_6 API"
    }
}
