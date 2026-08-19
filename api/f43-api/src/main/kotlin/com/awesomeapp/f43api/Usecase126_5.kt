package com.awesomeapp.f43api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase126_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase126_5 UseCase")
    }
}
