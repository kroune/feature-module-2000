package com.awesomeapp.f182impl

sealed class State904_7 {
    data object Loading : State904_7()
    data class Success(val data: String) : State904_7()
    data class Error(val message: String) : State904_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
