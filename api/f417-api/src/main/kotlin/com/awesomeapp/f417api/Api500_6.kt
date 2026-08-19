package com.awesomeapp.f417api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api500_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api500_6 API"
    }
}
