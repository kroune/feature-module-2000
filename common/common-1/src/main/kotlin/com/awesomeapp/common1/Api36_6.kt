package com.awesomeapp.common1

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api36_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api36_6 API"
    }
}
