package com.awesomeapp.f331api

sealed class State414_6 {
    data object Loading : State414_6()
    data class Success(val data: String) : State414_6()
    data class Error(val message: String) : State414_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
