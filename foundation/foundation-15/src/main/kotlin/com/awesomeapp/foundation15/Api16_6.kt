package com.awesomeapp.foundation15

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api16_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api16_6 API"
    }
}
