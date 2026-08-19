package com.awesomeapp.f74impl

sealed class State796_10 {
    data object Loading : State796_10()
    data class Success(val data: String) : State796_10()
    data class Error(val message: String) : State796_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
