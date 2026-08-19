package com.awesomeapp.f136impl

sealed class State858_6 {
    data object Loading : State858_6()
    data class Success(val data: String) : State858_6()
    data class Error(val message: String) : State858_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
