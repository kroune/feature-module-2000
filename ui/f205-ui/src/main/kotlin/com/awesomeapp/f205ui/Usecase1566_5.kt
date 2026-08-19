package com.awesomeapp.f205ui

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1566_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1566_5 UseCase")
    }
}
