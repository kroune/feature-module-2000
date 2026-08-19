package com.awesomeapp.foundation3

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api4_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api4_6 API"
    }
}
