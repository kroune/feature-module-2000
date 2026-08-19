package com.awesomeapp.f276impl

sealed class State998_5 {
    data object Loading : State998_5()
    data class Success(val data: String) : State998_5()
    data class Error(val message: String) : State998_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
