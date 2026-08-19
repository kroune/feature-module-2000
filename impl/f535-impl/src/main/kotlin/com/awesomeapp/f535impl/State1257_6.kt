package com.awesomeapp.f535impl

sealed class State1257_6 {
    data object Loading : State1257_6()
    data class Success(val data: String) : State1257_6()
    data class Error(val message: String) : State1257_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
