package com.awesomeapp.f170impl

sealed class State892_7 {
    data object Loading : State892_7()
    data class Success(val data: String) : State892_7()
    data class Error(val message: String) : State892_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
