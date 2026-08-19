package com.awesomeapp.f314api

sealed class State397_8 {
    data object Loading : State397_8()
    data class Success(val data: String) : State397_8()
    data class Error(val message: String) : State397_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
