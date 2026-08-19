package com.awesomeapp.f249impl

sealed class State971_5 {
    data object Loading : State971_5()
    data class Success(val data: String) : State971_5()
    data class Error(val message: String) : State971_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
