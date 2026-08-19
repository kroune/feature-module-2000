package com.awesomeapp.f36impl

sealed class State758_8 {
    data object Loading : State758_8()
    data class Success(val data: String) : State758_8()
    data class Error(val message: String) : State758_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
