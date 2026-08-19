package com.awesomeapp.f190api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase273_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase273_5 UseCase")
    }
}
