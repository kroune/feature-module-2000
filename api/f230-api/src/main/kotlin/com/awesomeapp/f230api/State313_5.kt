package com.awesomeapp.f230api

sealed class State313_5 {
    data object Loading : State313_5()
    data class Success(val data: String) : State313_5()
    data class Error(val message: String) : State313_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
