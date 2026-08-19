package com.awesomeapp.f260api

sealed class State343_8 {
    data object Loading : State343_8()
    data class Success(val data: String) : State343_8()
    data class Error(val message: String) : State343_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
