package com.awesomeapp.f10ui

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1371_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1371_5 UseCase")
    }
}
