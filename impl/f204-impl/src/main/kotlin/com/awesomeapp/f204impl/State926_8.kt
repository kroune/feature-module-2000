package com.awesomeapp.f204impl

sealed class State926_8 {
    data object Loading : State926_8()
    data class Success(val data: String) : State926_8()
    data class Error(val message: String) : State926_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
