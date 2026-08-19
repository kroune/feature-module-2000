package com.awesomeapp.f593api

sealed class State676_7 {
    data object Loading : State676_7()
    data class Success(val data: String) : State676_7()
    data class Error(val message: String) : State676_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
