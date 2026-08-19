package com.awesomeapp.f223api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase306_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase306_5 UseCase")
    }
}
