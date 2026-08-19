package com.awesomeapp.f405ui

sealed class State1766_8 {
    data object Loading : State1766_8()
    data class Success(val data: String) : State1766_8()
    data class Error(val message: String) : State1766_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
