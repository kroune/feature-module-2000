package com.awesomeapp.f28ui

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1389_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1389_5 UseCase")
    }
}
