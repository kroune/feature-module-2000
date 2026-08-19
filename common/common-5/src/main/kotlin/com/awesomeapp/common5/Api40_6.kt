package com.awesomeapp.common5

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api40_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api40_6 API"
    }
}
