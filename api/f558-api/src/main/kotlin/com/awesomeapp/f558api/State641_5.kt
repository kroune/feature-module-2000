package com.awesomeapp.f558api

sealed class State641_5 {
    data object Loading : State641_5()
    data class Success(val data: String) : State641_5()
    data class Error(val message: String) : State641_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
