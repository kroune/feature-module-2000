package com.awesomeapp.f130api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase213_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase213_5 UseCase")
    }
}
