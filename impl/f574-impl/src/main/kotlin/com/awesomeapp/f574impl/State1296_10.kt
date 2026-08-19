package com.awesomeapp.f574impl

sealed class State1296_10 {
    data object Loading : State1296_10()
    data class Success(val data: String) : State1296_10()
    data class Error(val message: String) : State1296_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
