package com.awesomeapp.f347api

sealed class State430_7 {
    data object Loading : State430_7()
    data class Success(val data: String) : State430_7()
    data class Error(val message: String) : State430_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
