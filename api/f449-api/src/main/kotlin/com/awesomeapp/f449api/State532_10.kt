package com.awesomeapp.f449api

sealed class State532_10 {
    data object Loading : State532_10()
    data class Success(val data: String) : State532_10()
    data class Error(val message: String) : State532_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
