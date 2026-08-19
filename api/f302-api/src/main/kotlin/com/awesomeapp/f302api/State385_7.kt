package com.awesomeapp.f302api

sealed class State385_7 {
    data object Loading : State385_7()
    data class Success(val data: String) : State385_7()
    data class Error(val message: String) : State385_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
