package com.awesomeapp.f488ui

sealed class State1849_8 {
    data object Loading : State1849_8()
    data class Success(val data: String) : State1849_8()
    data class Error(val message: String) : State1849_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
