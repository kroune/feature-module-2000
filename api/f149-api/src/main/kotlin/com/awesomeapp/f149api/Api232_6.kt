package com.awesomeapp.f149api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api232_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api232_6 API"
    }
}
