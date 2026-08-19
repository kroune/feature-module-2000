package com.awesomeapp.f570api

sealed class State653_8 {
    data object Loading : State653_8()
    data class Success(val data: String) : State653_8()
    data class Error(val message: String) : State653_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
