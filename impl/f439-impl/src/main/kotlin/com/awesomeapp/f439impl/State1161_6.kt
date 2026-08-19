package com.awesomeapp.f439impl

sealed class State1161_6 {
    data object Loading : State1161_6()
    data class Success(val data: String) : State1161_6()
    data class Error(val message: String) : State1161_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
