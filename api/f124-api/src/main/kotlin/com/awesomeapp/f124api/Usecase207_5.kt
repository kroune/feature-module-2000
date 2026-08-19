package com.awesomeapp.f124api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase207_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase207_5 UseCase")
    }
}
