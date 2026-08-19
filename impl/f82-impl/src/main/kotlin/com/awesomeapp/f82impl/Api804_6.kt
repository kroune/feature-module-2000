package com.awesomeapp.f82impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api804_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api804_6 API"
    }
}
