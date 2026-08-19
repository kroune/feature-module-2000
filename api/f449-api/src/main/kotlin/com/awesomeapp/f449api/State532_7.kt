package com.awesomeapp.f449api

sealed class State532_7 {
    data object Loading : State532_7()
    data class Success(val data: String) : State532_7()
    data class Error(val message: String) : State532_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
