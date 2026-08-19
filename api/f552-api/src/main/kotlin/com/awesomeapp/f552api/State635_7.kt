package com.awesomeapp.f552api

sealed class State635_7 {
    data object Loading : State635_7()
    data class Success(val data: String) : State635_7()
    data class Error(val message: String) : State635_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
