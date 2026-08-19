package com.awesomeapp.f521api

sealed class State604_10 {
    data object Loading : State604_10()
    data class Success(val data: String) : State604_10()
    data class Error(val message: String) : State604_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
