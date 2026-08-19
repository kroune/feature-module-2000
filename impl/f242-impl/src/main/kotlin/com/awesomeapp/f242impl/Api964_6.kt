package com.awesomeapp.f242impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api964_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api964_6 API"
    }
}
