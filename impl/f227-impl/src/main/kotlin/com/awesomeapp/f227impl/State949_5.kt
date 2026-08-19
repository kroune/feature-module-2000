package com.awesomeapp.f227impl

sealed class State949_5 {
    data object Loading : State949_5()
    data class Success(val data: String) : State949_5()
    data class Error(val message: String) : State949_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
