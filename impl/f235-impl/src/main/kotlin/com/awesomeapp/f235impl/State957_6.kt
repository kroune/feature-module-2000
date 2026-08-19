package com.awesomeapp.f235impl

sealed class State957_6 {
    data object Loading : State957_6()
    data class Success(val data: String) : State957_6()
    data class Error(val message: String) : State957_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
