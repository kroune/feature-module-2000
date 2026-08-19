package com.awesomeapp.f125impl

sealed class State847_8 {
    data object Loading : State847_8()
    data class Success(val data: String) : State847_8()
    data class Error(val message: String) : State847_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
