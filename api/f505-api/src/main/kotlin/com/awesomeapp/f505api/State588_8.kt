package com.awesomeapp.f505api

sealed class State588_8 {
    data object Loading : State588_8()
    data class Success(val data: String) : State588_8()
    data class Error(val message: String) : State588_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
