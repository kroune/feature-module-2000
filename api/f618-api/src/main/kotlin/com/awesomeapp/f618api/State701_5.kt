package com.awesomeapp.f618api

sealed class State701_5 {
    data object Loading : State701_5()
    data class Success(val data: String) : State701_5()
    data class Error(val message: String) : State701_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
