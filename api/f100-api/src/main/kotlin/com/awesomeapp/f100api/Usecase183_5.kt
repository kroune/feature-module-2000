package com.awesomeapp.f100api

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase183_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase183_5 UseCase")
    }
}
