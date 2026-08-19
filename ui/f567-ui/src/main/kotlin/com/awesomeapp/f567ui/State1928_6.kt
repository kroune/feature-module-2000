package com.awesomeapp.f567ui

sealed class State1928_6 {
    data object Loading : State1928_6()
    data class Success(val data: String) : State1928_6()
    data class Error(val message: String) : State1928_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
