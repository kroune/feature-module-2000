package com.awesomeapp.f2impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api724_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api724_6 API"
    }
}
