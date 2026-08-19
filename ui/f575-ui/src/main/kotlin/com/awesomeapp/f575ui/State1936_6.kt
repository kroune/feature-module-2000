package com.awesomeapp.f575ui

sealed class State1936_6 {
    data object Loading : State1936_6()
    data class Success(val data: String) : State1936_6()
    data class Error(val message: String) : State1936_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
