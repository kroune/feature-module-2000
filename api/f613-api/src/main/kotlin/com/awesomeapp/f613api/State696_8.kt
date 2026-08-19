package com.awesomeapp.f613api

sealed class State696_8 {
    data object Loading : State696_8()
    data class Success(val data: String) : State696_8()
    data class Error(val message: String) : State696_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
