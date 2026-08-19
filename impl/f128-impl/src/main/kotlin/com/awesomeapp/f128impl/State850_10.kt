package com.awesomeapp.f128impl

sealed class State850_10 {
    data object Loading : State850_10()
    data class Success(val data: String) : State850_10()
    data class Error(val message: String) : State850_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
