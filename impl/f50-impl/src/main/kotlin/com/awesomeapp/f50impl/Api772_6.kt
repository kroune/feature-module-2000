package com.awesomeapp.f50impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api772_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api772_6 API"
    }
}
