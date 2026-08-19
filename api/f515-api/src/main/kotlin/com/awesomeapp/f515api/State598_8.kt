package com.awesomeapp.f515api

sealed class State598_8 {
    data object Loading : State598_8()
    data class Success(val data: String) : State598_8()
    data class Error(val message: String) : State598_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
