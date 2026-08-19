package com.awesomeapp.f482api

sealed class State565_7 {
    data object Loading : State565_7()
    data class Success(val data: String) : State565_7()
    data class Error(val message: String) : State565_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
