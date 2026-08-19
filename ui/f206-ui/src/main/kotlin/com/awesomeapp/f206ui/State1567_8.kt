package com.awesomeapp.f206ui

sealed class State1567_8 {
    data object Loading : State1567_8()
    data class Success(val data: String) : State1567_8()
    data class Error(val message: String) : State1567_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
