package com.awesomeapp.f106impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api828_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api828_6 API"
    }
}
