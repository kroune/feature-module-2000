package com.awesomeapp.foundation23

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api24_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api24_6 API"
    }
}
