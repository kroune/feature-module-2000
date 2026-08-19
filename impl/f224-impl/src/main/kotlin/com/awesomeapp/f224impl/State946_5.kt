package com.awesomeapp.f224impl

sealed class State946_5 {
    data object Loading : State946_5()
    data class Success(val data: String) : State946_5()
    data class Error(val message: String) : State946_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
