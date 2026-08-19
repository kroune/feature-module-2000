package com.awesomeapp.f384ui

sealed class State1745_7 {
    data object Loading : State1745_7()
    data class Success(val data: String) : State1745_7()
    data class Error(val message: String) : State1745_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
