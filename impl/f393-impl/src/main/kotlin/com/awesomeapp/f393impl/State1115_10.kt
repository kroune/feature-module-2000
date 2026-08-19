package com.awesomeapp.f393impl

sealed class State1115_10 {
    data object Loading : State1115_10()
    data class Success(val data: String) : State1115_10()
    data class Error(val message: String) : State1115_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
