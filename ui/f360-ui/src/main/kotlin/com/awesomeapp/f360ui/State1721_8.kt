package com.awesomeapp.f360ui

sealed class State1721_8 {
    data object Loading : State1721_8()
    data class Success(val data: String) : State1721_8()
    data class Error(val message: String) : State1721_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
