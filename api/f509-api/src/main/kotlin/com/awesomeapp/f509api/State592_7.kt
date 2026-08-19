package com.awesomeapp.f509api

sealed class State592_7 {
    data object Loading : State592_7()
    data class Success(val data: String) : State592_7()
    data class Error(val message: String) : State592_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
