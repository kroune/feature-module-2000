package com.awesomeapp.f280impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1002_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1002_5 UseCase")
    }
}
