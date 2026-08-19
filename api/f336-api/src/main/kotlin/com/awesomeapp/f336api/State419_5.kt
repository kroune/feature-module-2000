package com.awesomeapp.f336api

sealed class State419_5 {
    data object Loading : State419_5()
    data class Success(val data: String) : State419_5()
    data class Error(val message: String) : State419_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
