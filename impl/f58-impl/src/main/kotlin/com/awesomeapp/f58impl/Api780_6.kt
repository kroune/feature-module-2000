package com.awesomeapp.f58impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api780_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api780_6 API"
    }
}
