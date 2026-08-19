package com.awesomeapp.f107impl

sealed class State829_5 {
    data object Loading : State829_5()
    data class Success(val data: String) : State829_5()
    data class Error(val message: String) : State829_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
