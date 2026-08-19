package com.awesomeapp.f365impl

sealed class State1087_5 {
    data object Loading : State1087_5()
    data class Success(val data: String) : State1087_5()
    data class Error(val message: String) : State1087_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
