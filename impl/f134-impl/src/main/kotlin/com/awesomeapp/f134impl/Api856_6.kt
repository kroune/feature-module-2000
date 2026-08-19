package com.awesomeapp.f134impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api856_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api856_6 API"
    }
}
