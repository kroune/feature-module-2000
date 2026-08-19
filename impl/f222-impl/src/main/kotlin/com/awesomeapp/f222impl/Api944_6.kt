package com.awesomeapp.f222impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api944_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api944_6 API"
    }
}
