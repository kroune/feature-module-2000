package com.awesomeapp.f241ui

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1602_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1602_5 UseCase")
    }
}
