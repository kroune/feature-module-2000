package com.awesomeapp.f396api

sealed class State479_8 {
    data object Loading : State479_8()
    data class Success(val data: String) : State479_8()
    data class Error(val message: String) : State479_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
