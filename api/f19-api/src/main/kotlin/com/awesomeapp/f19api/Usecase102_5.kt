package com.awesomeapp.f19api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase102_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase102_5 UseCase")
    }
}
