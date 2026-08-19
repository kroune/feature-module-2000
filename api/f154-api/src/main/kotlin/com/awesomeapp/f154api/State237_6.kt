package com.awesomeapp.f154api

sealed class State237_6 {
    data object Loading : State237_6()
    data class Success(val data: String) : State237_6()
    data class Error(val message: String) : State237_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
