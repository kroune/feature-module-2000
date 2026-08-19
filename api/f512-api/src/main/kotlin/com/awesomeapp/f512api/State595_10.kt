package com.awesomeapp.f512api

sealed class State595_10 {
    data object Loading : State595_10()
    data class Success(val data: String) : State595_10()
    data class Error(val message: String) : State595_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
