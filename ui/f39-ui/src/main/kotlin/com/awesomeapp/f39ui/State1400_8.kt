package com.awesomeapp.f39ui

sealed class State1400_8 {
    data object Loading : State1400_8()
    data class Success(val data: String) : State1400_8()
    data class Error(val message: String) : State1400_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
