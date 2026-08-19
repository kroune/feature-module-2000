package com.awesomeapp.f480api

sealed class State563_8 {
    data object Loading : State563_8()
    data class Success(val data: String) : State563_8()
    data class Error(val message: String) : State563_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
