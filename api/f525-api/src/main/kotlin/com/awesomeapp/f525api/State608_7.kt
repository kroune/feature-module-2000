package com.awesomeapp.f525api

sealed class State608_7 {
    data object Loading : State608_7()
    data class Success(val data: String) : State608_7()
    data class Error(val message: String) : State608_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
