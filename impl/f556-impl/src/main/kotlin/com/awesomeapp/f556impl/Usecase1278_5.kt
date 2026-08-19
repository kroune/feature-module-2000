package com.awesomeapp.f556impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1278_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1278_5 UseCase")
    }
}
