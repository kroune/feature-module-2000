package com.awesomeapp.f349api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api432_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api432_6 API"
    }
}
