package com.awesomeapp.f115ui

sealed class State1476_10 {
    data object Loading : State1476_10()
    data class Success(val data: String) : State1476_10()
    data class Error(val message: String) : State1476_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
