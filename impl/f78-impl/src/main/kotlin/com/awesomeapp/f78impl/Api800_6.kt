package com.awesomeapp.f78impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api800_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api800_6 API"
    }
}
