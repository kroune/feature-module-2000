package com.awesomeapp.f14impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api736_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api736_6 API"
    }
}
