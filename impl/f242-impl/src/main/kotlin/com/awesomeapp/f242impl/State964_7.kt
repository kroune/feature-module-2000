package com.awesomeapp.f242impl

sealed class State964_7 {
    data object Loading : State964_7()
    data class Success(val data: String) : State964_7()
    data class Error(val message: String) : State964_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
