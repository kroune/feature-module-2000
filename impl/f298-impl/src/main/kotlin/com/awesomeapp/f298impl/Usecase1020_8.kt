package com.awesomeapp.f298impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase1020_8 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase1020_8 UseCase")
    }
}
