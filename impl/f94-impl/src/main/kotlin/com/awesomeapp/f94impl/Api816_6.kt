package com.awesomeapp.f94impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api816_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api816_6 API"
    }
}
