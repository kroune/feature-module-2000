package com.awesomeapp.f301impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1023_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1023_5 UseCase")
    }
}
