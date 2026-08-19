package com.awesomeapp.core9

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api68_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api68_6 API"
    }
}
