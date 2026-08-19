package com.awesomeapp.f75impl

sealed class State797_5 {
    data object Loading : State797_5()
    data class Success(val data: String) : State797_5()
    data class Error(val message: String) : State797_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
