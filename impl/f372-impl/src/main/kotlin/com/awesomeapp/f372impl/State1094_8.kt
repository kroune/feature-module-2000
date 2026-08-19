package com.awesomeapp.f372impl

sealed class State1094_8 {
    data object Loading : State1094_8()
    data class Success(val data: String) : State1094_8()
    data class Error(val message: String) : State1094_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
