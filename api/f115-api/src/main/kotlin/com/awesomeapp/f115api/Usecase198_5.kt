package com.awesomeapp.f115api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase198_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase198_5 UseCase")
    }
}
