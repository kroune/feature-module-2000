package com.awesomeapp.f249api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api332_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api332_6 API"
    }
}
