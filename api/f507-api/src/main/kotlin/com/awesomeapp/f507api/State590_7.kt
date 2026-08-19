package com.awesomeapp.f507api

sealed class State590_7 {
    data object Loading : State590_7()
    data class Success(val data: String) : State590_7()
    data class Error(val message: String) : State590_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
