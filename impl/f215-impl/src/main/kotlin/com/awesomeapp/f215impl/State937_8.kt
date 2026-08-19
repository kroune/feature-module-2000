package com.awesomeapp.f215impl

sealed class State937_8 {
    data object Loading : State937_8()
    data class Success(val data: String) : State937_8()
    data class Error(val message: String) : State937_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
