package com.awesomeapp.f503impl

sealed class State1225_10 {
    data object Loading : State1225_10()
    data class Success(val data: String) : State1225_10()
    data class Error(val message: String) : State1225_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
