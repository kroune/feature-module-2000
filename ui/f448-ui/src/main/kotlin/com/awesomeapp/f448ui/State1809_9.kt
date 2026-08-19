package com.awesomeapp.f448ui

sealed class State1809_9 {
    data object Loading : State1809_9()
    data class Success(val data: String) : State1809_9()
    data class Error(val message: String) : State1809_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
