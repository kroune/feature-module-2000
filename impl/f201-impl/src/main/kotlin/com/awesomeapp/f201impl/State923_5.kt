package com.awesomeapp.f201impl

sealed class State923_5 {
    data object Loading : State923_5()
    data class Success(val data: String) : State923_5()
    data class Error(val message: String) : State923_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
