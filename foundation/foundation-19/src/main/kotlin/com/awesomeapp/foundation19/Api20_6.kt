package com.awesomeapp.foundation19

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api20_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api20_6 API"
    }
}
