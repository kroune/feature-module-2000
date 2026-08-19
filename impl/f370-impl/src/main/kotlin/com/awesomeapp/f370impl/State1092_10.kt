package com.awesomeapp.f370impl

sealed class State1092_10 {
    data object Loading : State1092_10()
    data class Success(val data: String) : State1092_10()
    data class Error(val message: String) : State1092_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
