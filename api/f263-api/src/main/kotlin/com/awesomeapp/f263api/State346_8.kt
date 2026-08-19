package com.awesomeapp.f263api

sealed class State346_8 {
    data object Loading : State346_8()
    data class Success(val data: String) : State346_8()
    data class Error(val message: String) : State346_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
