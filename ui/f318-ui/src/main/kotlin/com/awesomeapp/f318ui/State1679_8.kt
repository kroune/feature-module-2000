package com.awesomeapp.f318ui

sealed class State1679_8 {
    data object Loading : State1679_8()
    data class Success(val data: String) : State1679_8()
    data class Error(val message: String) : State1679_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
