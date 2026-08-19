package com.awesomeapp.f36ui

sealed class State1397_8 {
    data object Loading : State1397_8()
    data class Success(val data: String) : State1397_8()
    data class Error(val message: String) : State1397_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
