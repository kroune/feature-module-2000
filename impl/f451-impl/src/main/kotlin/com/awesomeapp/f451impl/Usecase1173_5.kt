package com.awesomeapp.f451impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1173_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1173_5 UseCase")
    }
}
