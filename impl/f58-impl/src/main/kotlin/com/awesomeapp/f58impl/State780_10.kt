package com.awesomeapp.f58impl

sealed class State780_10 {
    data object Loading : State780_10()
    data class Success(val data: String) : State780_10()
    data class Error(val message: String) : State780_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
