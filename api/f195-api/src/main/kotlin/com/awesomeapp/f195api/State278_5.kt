package com.awesomeapp.f195api

sealed class State278_5 {
    data object Loading : State278_5()
    data class Success(val data: String) : State278_5()
    data class Error(val message: String) : State278_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
