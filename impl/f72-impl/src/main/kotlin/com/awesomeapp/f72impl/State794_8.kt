package com.awesomeapp.f72impl

sealed class State794_8 {
    data object Loading : State794_8()
    data class Success(val data: String) : State794_8()
    data class Error(val message: String) : State794_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
