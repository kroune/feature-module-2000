package com.awesomeapp.f574api

sealed class State657_6 {
    data object Loading : State657_6()
    data class Success(val data: String) : State657_6()
    data class Error(val message: String) : State657_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
