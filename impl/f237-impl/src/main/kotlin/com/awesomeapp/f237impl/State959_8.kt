package com.awesomeapp.f237impl

sealed class State959_8 {
    data object Loading : State959_8()
    data class Success(val data: String) : State959_8()
    data class Error(val message: String) : State959_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
