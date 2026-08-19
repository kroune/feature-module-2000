package com.awesomeapp.core13

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api72_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api72_6 API"
    }
}
