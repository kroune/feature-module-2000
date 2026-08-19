package com.awesomeapp.f234impl

sealed class State956_7 {
    data object Loading : State956_7()
    data class Success(val data: String) : State956_7()
    data class Error(val message: String) : State956_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
