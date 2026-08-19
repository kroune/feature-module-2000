package com.awesomeapp.f239impl

sealed class State961_8 {
    data object Loading : State961_8()
    data class Success(val data: String) : State961_8()
    data class Error(val message: String) : State961_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
