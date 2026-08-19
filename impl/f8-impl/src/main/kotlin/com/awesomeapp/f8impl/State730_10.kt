package com.awesomeapp.f8impl

sealed class State730_10 {
    data object Loading : State730_10()
    data class Success(val data: String) : State730_10()
    data class Error(val message: String) : State730_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
