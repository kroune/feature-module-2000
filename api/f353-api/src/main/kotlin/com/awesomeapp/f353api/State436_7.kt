package com.awesomeapp.f353api

sealed class State436_7 {
    data object Loading : State436_7()
    data class Success(val data: String) : State436_7()
    data class Error(val message: String) : State436_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
