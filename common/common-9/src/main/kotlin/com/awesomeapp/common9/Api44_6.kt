package com.awesomeapp.common9

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api44_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api44_6 API"
    }
}
