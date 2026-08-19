package com.awesomeapp.f496impl

sealed class State1218_6 {
    data object Loading : State1218_6()
    data class Success(val data: String) : State1218_6()
    data class Error(val message: String) : State1218_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
