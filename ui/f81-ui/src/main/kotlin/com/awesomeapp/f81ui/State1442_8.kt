package com.awesomeapp.f81ui

sealed class State1442_8 {
    data object Loading : State1442_8()
    data class Success(val data: String) : State1442_8()
    data class Error(val message: String) : State1442_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
