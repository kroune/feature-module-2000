package com.awesomeapp.f571impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1293_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1293_5 UseCase")
    }
}
