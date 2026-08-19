package com.awesomeapp.f210api

sealed class State293_5 {
    data object Loading : State293_5()
    data class Success(val data: String) : State293_5()
    data class Error(val message: String) : State293_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
