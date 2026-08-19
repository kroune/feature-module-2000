package com.awesomeapp.f481impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1203_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1203_5 UseCase")
    }
}
