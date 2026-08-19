package com.awesomeapp.f320api

sealed class State403_5 {
    data object Loading : State403_5()
    data class Success(val data: String) : State403_5()
    data class Error(val message: String) : State403_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
