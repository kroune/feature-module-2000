package com.awesomeapp.f400impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1122_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1122_5 UseCase")
    }
}
