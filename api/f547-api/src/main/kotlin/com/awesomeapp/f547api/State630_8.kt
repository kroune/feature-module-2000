package com.awesomeapp.f547api

sealed class State630_8 {
    data object Loading : State630_8()
    data class Success(val data: String) : State630_8()
    data class Error(val message: String) : State630_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
