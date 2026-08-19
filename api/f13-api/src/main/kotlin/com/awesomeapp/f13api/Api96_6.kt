package com.awesomeapp.f13api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api96_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api96_6 API"
    }
}
