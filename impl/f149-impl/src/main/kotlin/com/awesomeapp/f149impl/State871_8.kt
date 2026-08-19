package com.awesomeapp.f149impl

sealed class State871_8 {
    data object Loading : State871_8()
    data class Success(val data: String) : State871_8()
    data class Error(val message: String) : State871_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
