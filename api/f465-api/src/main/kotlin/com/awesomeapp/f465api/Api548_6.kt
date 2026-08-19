package com.awesomeapp.f465api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api548_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api548_6 API"
    }
}
