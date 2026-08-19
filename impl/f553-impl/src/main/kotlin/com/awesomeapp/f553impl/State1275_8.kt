package com.awesomeapp.f553impl

sealed class State1275_8 {
    data object Loading : State1275_8()
    data class Success(val data: String) : State1275_8()
    data class Error(val message: String) : State1275_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
