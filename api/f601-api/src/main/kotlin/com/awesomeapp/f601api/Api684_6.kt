package com.awesomeapp.f601api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api684_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api684_6 API"
    }
}
