package com.awesomeapp.f62impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api784_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api784_6 API"
    }
}
