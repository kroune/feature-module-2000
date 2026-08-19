package com.awesomeapp.f401api

sealed class State484_10 {
    data object Loading : State484_10()
    data class Success(val data: String) : State484_10()
    data class Error(val message: String) : State484_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
