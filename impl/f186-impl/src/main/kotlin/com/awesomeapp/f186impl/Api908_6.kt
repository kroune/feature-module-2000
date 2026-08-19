package com.awesomeapp.f186impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api908_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api908_6 API"
    }
}
