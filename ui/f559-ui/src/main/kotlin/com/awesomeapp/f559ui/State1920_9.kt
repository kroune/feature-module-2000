package com.awesomeapp.f559ui

sealed class State1920_9 {
    data object Loading : State1920_9()
    data class Success(val data: String) : State1920_9()
    data class Error(val message: String) : State1920_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
