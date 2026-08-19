package com.awesomeapp.foundation11

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase12_7 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase12_7 UseCase")
    }
}
