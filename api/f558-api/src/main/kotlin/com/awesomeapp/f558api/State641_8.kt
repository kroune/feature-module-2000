package com.awesomeapp.f558api

sealed class State641_8 {
    data object Loading : State641_8()
    data class Success(val data: String) : State641_8()
    data class Error(val message: String) : State641_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
