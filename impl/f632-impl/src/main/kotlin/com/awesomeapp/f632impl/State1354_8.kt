package com.awesomeapp.f632impl

sealed class State1354_8 {
    data object Loading : State1354_8()
    data class Success(val data: String) : State1354_8()
    data class Error(val message: String) : State1354_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
