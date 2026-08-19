package com.awesomeapp.f209api

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class Api292_6 constructor() {
    suspend fun fetchData(): String = withContext(Dispatchers.IO) {
        "Data from Api292_6 API"
    }
}
