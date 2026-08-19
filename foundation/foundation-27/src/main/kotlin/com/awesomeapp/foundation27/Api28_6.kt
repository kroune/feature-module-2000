package com.awesomeapp.foundation27

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api28_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api28_6 API"
    }
}
