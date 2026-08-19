package com.awesomeapp.f70api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase153_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase153_5 UseCase")
    }
}
