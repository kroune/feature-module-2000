package com.awesomeapp.f293api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api376_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api376_6 API"
    }
}
