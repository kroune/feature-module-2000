package com.awesomeapp.core1

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api60_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api60_6 API"
    }
}
