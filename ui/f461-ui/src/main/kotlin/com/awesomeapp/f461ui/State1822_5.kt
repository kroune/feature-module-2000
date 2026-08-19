package com.awesomeapp.f461ui

sealed class State1822_5 {
    data object Loading : State1822_5()
    data class Success(val data: String) : State1822_5()
    data class Error(val message: String) : State1822_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
