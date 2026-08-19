package com.awesomeapp.f299ui

sealed class State1660_8 {
    data object Loading : State1660_8()
    data class Success(val data: String) : State1660_8()
    data class Error(val message: String) : State1660_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
