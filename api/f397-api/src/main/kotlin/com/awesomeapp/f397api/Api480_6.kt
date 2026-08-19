package com.awesomeapp.f397api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api480_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api480_6 API"
    }
}
