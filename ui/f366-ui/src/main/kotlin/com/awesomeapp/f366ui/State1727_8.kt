package com.awesomeapp.f366ui

sealed class State1727_8 {
    data object Loading : State1727_8()
    data class Success(val data: String) : State1727_8()
    data class Error(val message: String) : State1727_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
