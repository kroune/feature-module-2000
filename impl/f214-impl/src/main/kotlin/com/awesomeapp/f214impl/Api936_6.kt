package com.awesomeapp.f214impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api936_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api936_6 API"
    }
}
