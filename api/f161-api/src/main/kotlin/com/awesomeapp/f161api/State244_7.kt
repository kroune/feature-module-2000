package com.awesomeapp.f161api

sealed class State244_7 {
    data object Loading : State244_7()
    data class Success(val data: String) : State244_7()
    data class Error(val message: String) : State244_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
