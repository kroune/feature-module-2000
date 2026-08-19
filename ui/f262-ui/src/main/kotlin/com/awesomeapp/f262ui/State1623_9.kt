package com.awesomeapp.f262ui

sealed class State1623_9 {
    data object Loading : State1623_9()
    data class Success(val data: String) : State1623_9()
    data class Error(val message: String) : State1623_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
