package com.awesomeapp.f39impl

sealed class State761_8 {
    data object Loading : State761_8()
    data class Success(val data: String) : State761_8()
    data class Error(val message: String) : State761_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
