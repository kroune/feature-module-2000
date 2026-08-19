package com.awesomeapp.f530api

sealed class State613_5 {
    data object Loading : State613_5()
    data class Success(val data: String) : State613_5()
    data class Error(val message: String) : State613_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
