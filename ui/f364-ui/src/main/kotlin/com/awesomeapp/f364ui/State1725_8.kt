package com.awesomeapp.f364ui

sealed class State1725_8 {
    data object Loading : State1725_8()
    data class Success(val data: String) : State1725_8()
    data class Error(val message: String) : State1725_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
