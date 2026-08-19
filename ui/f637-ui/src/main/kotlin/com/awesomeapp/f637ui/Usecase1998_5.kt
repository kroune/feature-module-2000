package com.awesomeapp.f637ui

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1998_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1998_5 UseCase")
    }
}
