package com.awesomeapp.f82impl

sealed class State804_8 {
    data object Loading : State804_8()
    data class Success(val data: String) : State804_8()
    data class Error(val message: String) : State804_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
