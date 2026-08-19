package com.awesomeapp.f126impl

sealed class State848_10 {
    data object Loading : State848_10()
    data class Success(val data: String) : State848_10()
    data class Error(val message: String) : State848_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
