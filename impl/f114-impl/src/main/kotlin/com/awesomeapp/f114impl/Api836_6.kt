package com.awesomeapp.f114impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api836_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api836_6 API"
    }
}
