package com.awesomeapp.f182impl

sealed class State904_10 {
    data object Loading : State904_10()
    data class Success(val data: String) : State904_10()
    data class Error(val message: String) : State904_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
