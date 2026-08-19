package com.awesomeapp.f397api

sealed class State480_10 {
    data object Loading : State480_10()
    data class Success(val data: String) : State480_10()
    data class Error(val message: String) : State480_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
