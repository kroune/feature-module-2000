package com.awesomeapp.f183api

sealed class State266_5 {
    data object Loading : State266_5()
    data class Success(val data: String) : State266_5()
    data class Error(val message: String) : State266_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
