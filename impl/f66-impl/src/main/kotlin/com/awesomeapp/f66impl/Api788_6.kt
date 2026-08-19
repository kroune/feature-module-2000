package com.awesomeapp.f66impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api788_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api788_6 API"
    }
}
