package com.awesomeapp.f202impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api924_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api924_6 API"
    }
}
