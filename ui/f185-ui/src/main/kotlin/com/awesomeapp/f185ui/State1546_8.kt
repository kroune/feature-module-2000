package com.awesomeapp.f185ui

sealed class State1546_8 {
    data object Loading : State1546_8()
    data class Success(val data: String) : State1546_8()
    data class Error(val message: String) : State1546_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
