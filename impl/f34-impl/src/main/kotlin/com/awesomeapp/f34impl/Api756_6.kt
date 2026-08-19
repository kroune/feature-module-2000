package com.awesomeapp.f34impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api756_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api756_6 API"
    }
}
