package com.awesomeapp.f185impl

sealed class State907_8 {
    data object Loading : State907_8()
    data class Success(val data: String) : State907_8()
    data class Error(val message: String) : State907_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
