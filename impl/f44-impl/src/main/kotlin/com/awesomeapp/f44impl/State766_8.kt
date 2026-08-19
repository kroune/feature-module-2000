package com.awesomeapp.f44impl

sealed class State766_8 {
    data object Loading : State766_8()
    data class Success(val data: String) : State766_8()
    data class Error(val message: String) : State766_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
