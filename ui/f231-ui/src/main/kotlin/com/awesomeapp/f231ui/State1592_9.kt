package com.awesomeapp.f231ui

sealed class State1592_9 {
    data object Loading : State1592_9()
    data class Success(val data: String) : State1592_9()
    data class Error(val message: String) : State1592_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
