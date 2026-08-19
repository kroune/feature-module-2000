package com.awesomeapp.f569api

sealed class State652_10 {
    data object Loading : State652_10()
    data class Success(val data: String) : State652_10()
    data class Error(val message: String) : State652_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
