package com.awesomeapp.f242api

sealed class State325_7 {
    data object Loading : State325_7()
    data class Success(val data: String) : State325_7()
    data class Error(val message: String) : State325_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
