package com.awesomeapp.f541api

sealed class State624_8 {
    data object Loading : State624_8()
    data class Success(val data: String) : State624_8()
    data class Error(val message: String) : State624_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
