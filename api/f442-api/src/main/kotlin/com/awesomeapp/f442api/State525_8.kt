package com.awesomeapp.f442api

sealed class State525_8 {
    data object Loading : State525_8()
    data class Success(val data: String) : State525_8()
    data class Error(val message: String) : State525_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
