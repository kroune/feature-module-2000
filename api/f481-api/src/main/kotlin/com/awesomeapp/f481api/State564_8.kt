package com.awesomeapp.f481api

sealed class State564_8 {
    data object Loading : State564_8()
    data class Success(val data: String) : State564_8()
    data class Error(val message: String) : State564_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
