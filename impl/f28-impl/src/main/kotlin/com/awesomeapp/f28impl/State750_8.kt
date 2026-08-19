package com.awesomeapp.f28impl

sealed class State750_8 {
    data object Loading : State750_8()
    data class Success(val data: String) : State750_8()
    data class Error(val message: String) : State750_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
