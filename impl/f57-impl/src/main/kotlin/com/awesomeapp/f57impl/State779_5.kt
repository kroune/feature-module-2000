package com.awesomeapp.f57impl

sealed class State779_5 {
    data object Loading : State779_5()
    data class Success(val data: String) : State779_5()
    data class Error(val message: String) : State779_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
