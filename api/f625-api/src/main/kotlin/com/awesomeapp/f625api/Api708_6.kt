package com.awesomeapp.f625api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api708_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api708_6 API"
    }
}
