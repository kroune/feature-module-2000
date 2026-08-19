package com.awesomeapp.f204impl

sealed class State926_5 {
    data object Loading : State926_5()
    data class Success(val data: String) : State926_5()
    data class Error(val message: String) : State926_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
