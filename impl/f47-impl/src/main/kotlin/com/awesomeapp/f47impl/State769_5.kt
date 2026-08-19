package com.awesomeapp.f47impl

sealed class State769_5 {
    data object Loading : State769_5()
    data class Success(val data: String) : State769_5()
    data class Error(val message: String) : State769_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
