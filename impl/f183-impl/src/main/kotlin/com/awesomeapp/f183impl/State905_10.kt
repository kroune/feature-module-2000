package com.awesomeapp.f183impl

sealed class State905_10 {
    data object Loading : State905_10()
    data class Success(val data: String) : State905_10()
    data class Error(val message: String) : State905_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
