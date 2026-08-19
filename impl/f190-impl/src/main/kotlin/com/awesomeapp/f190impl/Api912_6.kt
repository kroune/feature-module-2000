package com.awesomeapp.f190impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api912_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api912_6 API"
    }
}
