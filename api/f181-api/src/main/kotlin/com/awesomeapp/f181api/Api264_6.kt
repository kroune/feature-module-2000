package com.awesomeapp.f181api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api264_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api264_6 API"
    }
}
