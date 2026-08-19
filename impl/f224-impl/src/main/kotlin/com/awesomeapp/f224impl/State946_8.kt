package com.awesomeapp.f224impl

sealed class State946_8 {
    data object Loading : State946_8()
    data class Success(val data: String) : State946_8()
    data class Error(val message: String) : State946_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
