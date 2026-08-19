package com.awesomeapp.f570api

sealed class State653_5 {
    data object Loading : State653_5()
    data class Success(val data: String) : State653_5()
    data class Error(val message: String) : State653_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
