package com.awesomeapp.f101impl

sealed class State823_8 {
    data object Loading : State823_8()
    data class Success(val data: String) : State823_8()
    data class Error(val message: String) : State823_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
