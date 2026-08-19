package com.awesomeapp.f589api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api672_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api672_6 API"
    }
}
