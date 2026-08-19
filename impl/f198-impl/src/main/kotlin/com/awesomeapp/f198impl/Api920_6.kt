package com.awesomeapp.f198impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api920_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api920_6 API"
    }
}
