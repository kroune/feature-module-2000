package com.awesomeapp.common17

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api52_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api52_6 API"
    }
}
