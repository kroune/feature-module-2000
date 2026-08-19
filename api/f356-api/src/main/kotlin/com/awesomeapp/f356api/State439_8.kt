package com.awesomeapp.f356api

sealed class State439_8 {
    data object Loading : State439_8()
    data class Success(val data: String) : State439_8()
    data class Error(val message: String) : State439_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
