package com.awesomeapp.f258impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api980_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api980_6 API"
    }
}
