package com.awesomeapp.f273api

sealed class State356_7 {
    data object Loading : State356_7()
    data class Success(val data: String) : State356_7()
    data class Error(val message: String) : State356_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
