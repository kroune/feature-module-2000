package com.awesomeapp.f616api

sealed class State699_6 {
    data object Loading : State699_6()
    data class Success(val data: String) : State699_6()
    data class Error(val message: String) : State699_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
