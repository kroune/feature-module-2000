package com.awesomeapp.f248impl

sealed class State970_7 {
    data object Loading : State970_7()
    data class Success(val data: String) : State970_7()
    data class Error(val message: String) : State970_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
