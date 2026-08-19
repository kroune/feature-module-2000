package com.awesomeapp.f373api

sealed class State456_8 {
    data object Loading : State456_8()
    data class Success(val data: String) : State456_8()
    data class Error(val message: String) : State456_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
