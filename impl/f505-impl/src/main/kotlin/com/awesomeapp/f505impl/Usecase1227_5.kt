package com.awesomeapp.f505impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1227_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1227_5 UseCase")
    }
}
