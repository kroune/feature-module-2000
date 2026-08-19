package com.awesomeapp.f87impl

sealed class State809_5 {
    data object Loading : State809_5()
    data class Success(val data: String) : State809_5()
    data class Error(val message: String) : State809_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
