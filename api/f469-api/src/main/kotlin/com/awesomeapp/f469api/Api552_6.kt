package com.awesomeapp.f469api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api552_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api552_6 API"
    }
}
