package com.awesomeapp.f480ui

sealed class State1841_8 {
    data object Loading : State1841_8()
    data class Success(val data: String) : State1841_8()
    data class Error(val message: String) : State1841_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
