package com.awesomeapp.f292impl

sealed class State1014_6 {
    data object Loading : State1014_6()
    data class Success(val data: String) : State1014_6()
    data class Error(val message: String) : State1014_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
