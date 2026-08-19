package com.awesomeapp.f176impl

sealed class State898_8 {
    data object Loading : State898_8()
    data class Success(val data: String) : State898_8()
    data class Error(val message: String) : State898_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
