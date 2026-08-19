package com.awesomeapp.f291api

sealed class State374_5 {
    data object Loading : State374_5()
    data class Success(val data: String) : State374_5()
    data class Error(val message: String) : State374_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
