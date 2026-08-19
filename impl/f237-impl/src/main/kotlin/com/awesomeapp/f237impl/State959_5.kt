package com.awesomeapp.f237impl

sealed class State959_5 {
    data object Loading : State959_5()
    data class Success(val data: String) : State959_5()
    data class Error(val message: String) : State959_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
