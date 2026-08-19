package com.awesomeapp.f298api

sealed class State381_6 {
    data object Loading : State381_6()
    data class Success(val data: String) : State381_6()
    data class Error(val message: String) : State381_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
