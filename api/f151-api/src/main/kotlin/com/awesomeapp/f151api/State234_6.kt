package com.awesomeapp.f151api

sealed class State234_6 {
    data object Loading : State234_6()
    data class Success(val data: String) : State234_6()
    data class Error(val message: String) : State234_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
