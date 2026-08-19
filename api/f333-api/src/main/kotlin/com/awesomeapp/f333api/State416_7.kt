package com.awesomeapp.f333api

sealed class State416_7 {
    data object Loading : State416_7()
    data class Success(val data: String) : State416_7()
    data class Error(val message: String) : State416_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
