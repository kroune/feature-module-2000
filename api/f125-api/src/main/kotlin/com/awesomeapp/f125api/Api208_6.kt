package com.awesomeapp.f125api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api208_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api208_6 API"
    }
}
