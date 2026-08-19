package com.awesomeapp.f148api

sealed class State231_6 {
    data object Loading : State231_6()
    data class Success(val data: String) : State231_6()
    data class Error(val message: String) : State231_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
