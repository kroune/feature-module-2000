package com.awesomeapp.f173impl

sealed class State895_7 {
    data object Loading : State895_7()
    data class Success(val data: String) : State895_7()
    data class Error(val message: String) : State895_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
