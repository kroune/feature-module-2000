package com.awesomeapp.f217api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase300_9 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase300_9 UseCase")
    }
}
