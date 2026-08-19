package com.awesomeapp.f97api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api180_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api180_6 API"
    }
}
