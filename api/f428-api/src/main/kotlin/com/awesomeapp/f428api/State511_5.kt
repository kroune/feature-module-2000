package com.awesomeapp.f428api

sealed class State511_5 {
    data object Loading : State511_5()
    data class Success(val data: String) : State511_5()
    data class Error(val message: String) : State511_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
