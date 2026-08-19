package com.awesomeapp.f248impl

sealed class State970_10 {
    data object Loading : State970_10()
    data class Success(val data: String) : State970_10()
    data class Error(val message: String) : State970_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
