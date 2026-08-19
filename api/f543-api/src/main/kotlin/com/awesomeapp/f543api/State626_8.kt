package com.awesomeapp.f543api

sealed class State626_8 {
    data object Loading : State626_8()
    data class Success(val data: String) : State626_8()
    data class Error(val message: String) : State626_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
