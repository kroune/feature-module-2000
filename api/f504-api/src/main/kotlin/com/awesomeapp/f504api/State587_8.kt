package com.awesomeapp.f504api

sealed class State587_8 {
    data object Loading : State587_8()
    data class Success(val data: String) : State587_8()
    data class Error(val message: String) : State587_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
