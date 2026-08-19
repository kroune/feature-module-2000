package com.awesomeapp.f475impl

sealed class State1197_6 {
    data object Loading : State1197_6()
    data class Success(val data: String) : State1197_6()
    data class Error(val message: String) : State1197_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
