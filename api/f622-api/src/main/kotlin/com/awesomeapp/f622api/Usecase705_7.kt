package com.awesomeapp.f622api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase705_7 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase705_7 UseCase")
    }
}
