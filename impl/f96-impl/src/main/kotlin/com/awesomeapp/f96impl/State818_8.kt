package com.awesomeapp.f96impl

sealed class State818_8 {
    data object Loading : State818_8()
    data class Success(val data: String) : State818_8()
    data class Error(val message: String) : State818_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
