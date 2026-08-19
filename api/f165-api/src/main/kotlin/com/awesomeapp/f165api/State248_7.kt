package com.awesomeapp.f165api

sealed class State248_7 {
    data object Loading : State248_7()
    data class Success(val data: String) : State248_7()
    data class Error(val message: String) : State248_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
