package com.awesomeapp.f276impl

sealed class State998_8 {
    data object Loading : State998_8()
    data class Success(val data: String) : State998_8()
    data class Error(val message: String) : State998_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
