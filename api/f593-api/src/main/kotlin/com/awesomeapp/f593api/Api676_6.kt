package com.awesomeapp.f593api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api676_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api676_6 API"
    }
}
