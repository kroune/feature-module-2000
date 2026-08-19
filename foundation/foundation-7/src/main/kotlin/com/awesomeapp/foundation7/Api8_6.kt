package com.awesomeapp.foundation7

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api8_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api8_6 API"
    }
}
