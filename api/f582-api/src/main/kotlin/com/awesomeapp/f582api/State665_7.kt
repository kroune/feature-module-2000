package com.awesomeapp.f582api

sealed class State665_7 {
    data object Loading : State665_7()
    data class Success(val data: String) : State665_7()
    data class Error(val message: String) : State665_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
