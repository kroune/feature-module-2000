package com.awesomeapp.f226ui

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1587_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1587_5 UseCase")
    }
}
