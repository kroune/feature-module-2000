package com.awesomeapp.f254impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api976_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api976_6 API"
    }
}
