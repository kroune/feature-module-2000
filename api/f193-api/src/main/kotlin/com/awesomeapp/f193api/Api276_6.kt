package com.awesomeapp.f193api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api276_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api276_6 API"
    }
}
