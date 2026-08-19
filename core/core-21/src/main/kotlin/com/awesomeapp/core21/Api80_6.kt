package com.awesomeapp.core21

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api80_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api80_6 API"
    }
}
