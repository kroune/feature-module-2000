package com.awesomeapp.f90impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api812_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api812_6 API"
    }
}
