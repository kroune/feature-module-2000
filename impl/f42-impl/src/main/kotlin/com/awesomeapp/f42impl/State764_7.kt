package com.awesomeapp.f42impl

sealed class State764_7 {
    data object Loading : State764_7()
    data class Success(val data: String) : State764_7()
    data class Error(val message: String) : State764_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
