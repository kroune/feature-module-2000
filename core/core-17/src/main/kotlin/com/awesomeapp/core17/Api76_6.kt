package com.awesomeapp.core17

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api76_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api76_6 API"
    }
}
