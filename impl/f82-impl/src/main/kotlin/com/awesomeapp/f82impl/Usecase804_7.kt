package com.awesomeapp.f82impl

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


class Usecase804_7 constructor() {
    operator fun invoke(): Flow<String> = flow {
        emit("Data from Usecase804_7 UseCase")
    }
}
