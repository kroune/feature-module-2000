package com.awesomeapp.f70impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api792_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api792_6 API"
    }
}
