package com.awesomeapp.f202ui

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1563_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1563_5 UseCase")
    }
}
