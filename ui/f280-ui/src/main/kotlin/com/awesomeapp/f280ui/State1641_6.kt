package com.awesomeapp.f280ui

sealed class State1641_6 {
    data object Loading : State1641_6()
    data class Success(val data: String) : State1641_6()
    data class Error(val message: String) : State1641_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
