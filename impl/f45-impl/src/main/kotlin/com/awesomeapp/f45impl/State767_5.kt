package com.awesomeapp.f45impl

sealed class State767_5 {
    data object Loading : State767_5()
    data class Success(val data: String) : State767_5()
    data class Error(val message: String) : State767_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
