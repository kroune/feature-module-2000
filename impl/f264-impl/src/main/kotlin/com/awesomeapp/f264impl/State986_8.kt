package com.awesomeapp.f264impl

sealed class State986_8 {
    data object Loading : State986_8()
    data class Success(val data: String) : State986_8()
    data class Error(val message: String) : State986_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
