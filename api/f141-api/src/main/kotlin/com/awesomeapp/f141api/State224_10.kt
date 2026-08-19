package com.awesomeapp.f141api

sealed class State224_10 {
    data object Loading : State224_10()
    data class Success(val data: String) : State224_10()
    data class Error(val message: String) : State224_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
