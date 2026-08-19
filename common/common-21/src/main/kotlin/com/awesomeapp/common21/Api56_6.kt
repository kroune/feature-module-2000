package com.awesomeapp.common21

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api56_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api56_6 API"
    }
}
