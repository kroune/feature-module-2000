package com.awesomeapp.f170impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api892_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api892_6 API"
    }
}
