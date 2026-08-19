package com.awesomeapp.f6impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api728_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api728_6 API"
    }
}
