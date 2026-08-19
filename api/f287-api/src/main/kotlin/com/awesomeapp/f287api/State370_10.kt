package com.awesomeapp.f287api

sealed class State370_10 {
    data object Loading : State370_10()
    data class Success(val data: String) : State370_10()
    data class Error(val message: String) : State370_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
