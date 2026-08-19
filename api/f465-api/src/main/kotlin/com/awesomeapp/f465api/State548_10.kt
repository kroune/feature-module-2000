package com.awesomeapp.f465api

sealed class State548_10 {
    data object Loading : State548_10()
    data class Success(val data: String) : State548_10()
    data class Error(val message: String) : State548_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
