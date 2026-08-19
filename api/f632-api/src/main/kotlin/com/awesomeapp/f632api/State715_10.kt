package com.awesomeapp.f632api

sealed class State715_10 {
    data object Loading : State715_10()
    data class Success(val data: String) : State715_10()
    data class Error(val message: String) : State715_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
