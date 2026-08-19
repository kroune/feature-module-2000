package com.awesomeapp.f352impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1074_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1074_5 UseCase")
    }
}
