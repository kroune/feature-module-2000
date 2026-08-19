package com.awesomeapp.f362ui

sealed class State1723_5 {
    data object Loading : State1723_5()
    data class Success(val data: String) : State1723_5()
    data class Error(val message: String) : State1723_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
