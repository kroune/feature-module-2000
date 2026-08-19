package com.awesomeapp.f191ui

sealed class State1552_6 {
    data object Loading : State1552_6()
    data class Success(val data: String) : State1552_6()
    data class Error(val message: String) : State1552_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
