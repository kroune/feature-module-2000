package com.awesomeapp.f291api

sealed class State374_8 {
    data object Loading : State374_8()
    data class Success(val data: String) : State374_8()
    data class Error(val message: String) : State374_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
