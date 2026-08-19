package com.awesomeapp.f10ui

sealed class State1371_9 {
    data object Loading : State1371_9()
    data class Success(val data: String) : State1371_9()
    data class Error(val message: String) : State1371_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
