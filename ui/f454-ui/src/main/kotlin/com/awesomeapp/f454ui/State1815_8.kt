package com.awesomeapp.f454ui

sealed class State1815_8 {
    data object Loading : State1815_8()
    data class Success(val data: String) : State1815_8()
    data class Error(val message: String) : State1815_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
