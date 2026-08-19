package com.awesomeapp.foundation20

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase21_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase21_5 UseCase")
    }
}
