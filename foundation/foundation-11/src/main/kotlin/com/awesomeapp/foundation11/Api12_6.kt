package com.awesomeapp.foundation11

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api12_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api12_6 API"
    }
}
