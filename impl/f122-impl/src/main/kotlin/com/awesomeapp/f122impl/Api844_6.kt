package com.awesomeapp.f122impl

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api844_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api844_6 API"
    }
}
