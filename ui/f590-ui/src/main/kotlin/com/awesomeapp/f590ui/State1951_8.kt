package com.awesomeapp.f590ui

sealed class State1951_8 {
    data object Loading : State1951_8()
    data class Success(val data: String) : State1951_8()
    data class Error(val message: String) : State1951_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
