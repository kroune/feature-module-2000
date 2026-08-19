package com.awesomeapp.f254impl

sealed class State976_7 {
    data object Loading : State976_7()
    data class Success(val data: String) : State976_7()
    data class Error(val message: String) : State976_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
