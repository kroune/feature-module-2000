package com.awesomeapp.f261api

sealed class State344_7 {
    data object Loading : State344_7()
    data class Success(val data: String) : State344_7()
    data class Error(val message: String) : State344_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
