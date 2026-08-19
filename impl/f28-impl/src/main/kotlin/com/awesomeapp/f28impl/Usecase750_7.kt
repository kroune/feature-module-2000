package com.awesomeapp.f28impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase750_7 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase750_7 UseCase")
    }
}
