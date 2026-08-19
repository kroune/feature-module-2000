package com.awesomeapp.f51impl

sealed class State773_5 {
    data object Loading : State773_5()
    data class Success(val data: String) : State773_5()
    data class Error(val message: String) : State773_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
