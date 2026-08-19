package com.awesomeapp.f80impl

sealed class State802_8 {
    data object Loading : State802_8()
    data class Success(val data: String) : State802_8()
    data class Error(val message: String) : State802_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
