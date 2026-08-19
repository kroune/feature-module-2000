package com.awesomeapp.f490api

sealed class State573_6 {
    data object Loading : State573_6()
    data class Success(val data: String) : State573_6()
    data class Error(val message: String) : State573_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
