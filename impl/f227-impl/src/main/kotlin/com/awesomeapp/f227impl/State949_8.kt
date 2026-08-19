package com.awesomeapp.f227impl

sealed class State949_8 {
    data object Loading : State949_8()
    data class Success(val data: String) : State949_8()
    data class Error(val message: String) : State949_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
