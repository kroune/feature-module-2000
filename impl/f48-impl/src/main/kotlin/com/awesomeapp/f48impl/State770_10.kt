package com.awesomeapp.f48impl

sealed class State770_10 {
    data object Loading : State770_10()
    data class Success(val data: String) : State770_10()
    data class Error(val message: String) : State770_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
