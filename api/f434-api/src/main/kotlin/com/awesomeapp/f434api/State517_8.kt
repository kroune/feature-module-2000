package com.awesomeapp.f434api

sealed class State517_8 {
    data object Loading : State517_8()
    data class Success(val data: String) : State517_8()
    data class Error(val message: String) : State517_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
