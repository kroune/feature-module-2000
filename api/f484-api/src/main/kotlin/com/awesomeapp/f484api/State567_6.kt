package com.awesomeapp.f484api

sealed class State567_6 {
    data object Loading : State567_6()
    data class Success(val data: String) : State567_6()
    data class Error(val message: String) : State567_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
