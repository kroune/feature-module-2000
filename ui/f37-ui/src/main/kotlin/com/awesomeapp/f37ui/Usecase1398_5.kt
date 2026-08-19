package com.awesomeapp.f37ui

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1398_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1398_5 UseCase")
    }
}
