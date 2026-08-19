package com.awesomeapp.f139api

sealed class State222_6 {
    data object Loading : State222_6()
    data class Success(val data: String) : State222_6()
    data class Error(val message: String) : State222_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
