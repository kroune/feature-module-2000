package com.awesomeapp.f76impl

sealed class State798_6 {
    data object Loading : State798_6()
    data class Success(val data: String) : State798_6()
    data class Error(val message: String) : State798_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
