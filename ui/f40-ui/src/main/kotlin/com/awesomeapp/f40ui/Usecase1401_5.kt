package com.awesomeapp.f40ui

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1401_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1401_5 UseCase")
    }
}
