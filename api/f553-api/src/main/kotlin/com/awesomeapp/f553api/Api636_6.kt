package com.awesomeapp.f553api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api636_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api636_6 API"
    }
}
