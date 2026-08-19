package com.awesomeapp.f142ui

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1503_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1503_5 UseCase")
    }
}
