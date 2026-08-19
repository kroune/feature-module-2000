package com.awesomeapp.f472impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1194_5 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1194_5 UseCase")
    }
}
