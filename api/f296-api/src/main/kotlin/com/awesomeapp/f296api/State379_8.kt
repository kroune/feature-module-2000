package com.awesomeapp.f296api

sealed class State379_8 {
    data object Loading : State379_8()
    data class Success(val data: String) : State379_8()
    data class Error(val message: String) : State379_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
