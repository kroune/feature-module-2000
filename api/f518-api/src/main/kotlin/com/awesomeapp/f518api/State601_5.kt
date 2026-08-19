package com.awesomeapp.f518api

sealed class State601_5 {
    data object Loading : State601_5()
    data class Success(val data: String) : State601_5()
    data class Error(val message: String) : State601_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
