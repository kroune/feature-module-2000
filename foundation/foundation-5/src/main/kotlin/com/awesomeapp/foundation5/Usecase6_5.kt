package com.awesomeapp.foundation5

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase6_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase6_5 UseCase")
    }
}
