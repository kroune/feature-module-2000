package com.awesomeapp.f523api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase606_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase606_5 UseCase")
    }
}
