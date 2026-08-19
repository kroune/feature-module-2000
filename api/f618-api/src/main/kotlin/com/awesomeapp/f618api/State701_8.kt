package com.awesomeapp.f618api

sealed class State701_8 {
    data object Loading : State701_8()
    data class Success(val data: String) : State701_8()
    data class Error(val message: String) : State701_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
