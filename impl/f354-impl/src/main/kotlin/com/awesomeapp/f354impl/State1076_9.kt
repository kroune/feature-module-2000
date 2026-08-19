package com.awesomeapp.f354impl

sealed class State1076_9 {
    data object Loading : State1076_9()
    data class Success(val data: String) : State1076_9()
    data class Error(val message: String) : State1076_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
