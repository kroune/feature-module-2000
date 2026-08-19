package com.awesomeapp.f158impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api880_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api880_6 API"
    }
}
