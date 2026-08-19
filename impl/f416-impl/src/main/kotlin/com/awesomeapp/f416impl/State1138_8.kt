package com.awesomeapp.f416impl

sealed class State1138_8 {
    data object Loading : State1138_8()
    data class Success(val data: String) : State1138_8()
    data class Error(val message: String) : State1138_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
