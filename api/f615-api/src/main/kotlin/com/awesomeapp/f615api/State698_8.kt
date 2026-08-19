package com.awesomeapp.f615api

sealed class State698_8 {
    data object Loading : State698_8()
    data class Success(val data: String) : State698_8()
    data class Error(val message: String) : State698_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
