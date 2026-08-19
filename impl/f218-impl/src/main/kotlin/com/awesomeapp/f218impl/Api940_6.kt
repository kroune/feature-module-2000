package com.awesomeapp.f218impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api940_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api940_6 API"
    }
}
