package com.awesomeapp.f85api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api168_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api168_6 API"
    }
}
