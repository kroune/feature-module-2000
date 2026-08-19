package com.awesomeapp.f249impl

sealed class State971_8 {
    data object Loading : State971_8()
    data class Success(val data: String) : State971_8()
    data class Error(val message: String) : State971_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
