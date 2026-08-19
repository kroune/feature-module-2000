package com.awesomeapp.f319api

sealed class State402_6 {
    data object Loading : State402_6()
    data class Success(val data: String) : State402_6()
    data class Error(val message: String) : State402_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
