package com.awesomeapp.f519ui

sealed class State1880_8 {
    data object Loading : State1880_8()
    data class Success(val data: String) : State1880_8()
    data class Error(val message: String) : State1880_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
