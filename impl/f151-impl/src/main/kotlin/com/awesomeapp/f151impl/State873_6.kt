package com.awesomeapp.f151impl

sealed class State873_6 {
    data object Loading : State873_6()
    data class Success(val data: String) : State873_6()
    data class Error(val message: String) : State873_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
