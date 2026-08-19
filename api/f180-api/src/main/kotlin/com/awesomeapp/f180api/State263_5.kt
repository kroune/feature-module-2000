package com.awesomeapp.f180api

sealed class State263_5 {
    data object Loading : State263_5()
    data class Success(val data: String) : State263_5()
    data class Error(val message: String) : State263_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
