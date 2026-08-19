package com.awesomeapp.f263api

sealed class State346_5 {
    data object Loading : State346_5()
    data class Success(val data: String) : State346_5()
    data class Error(val message: String) : State346_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
