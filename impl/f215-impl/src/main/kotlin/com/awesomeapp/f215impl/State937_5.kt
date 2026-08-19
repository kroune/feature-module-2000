package com.awesomeapp.f215impl

sealed class State937_5 {
    data object Loading : State937_5()
    data class Success(val data: String) : State937_5()
    data class Error(val message: String) : State937_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
