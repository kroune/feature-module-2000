package com.awesomeapp.f22api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase105_7 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase105_7 UseCase")
    }
}
