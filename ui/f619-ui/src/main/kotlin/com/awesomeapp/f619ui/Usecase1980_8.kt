package com.awesomeapp.f619ui

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1980_8 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1980_8 UseCase")
    }
}
