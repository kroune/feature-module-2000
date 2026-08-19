package com.awesomeapp.f199ui

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1560_8 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1560_8 UseCase")
    }
}
