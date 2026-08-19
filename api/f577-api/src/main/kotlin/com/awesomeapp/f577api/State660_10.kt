package com.awesomeapp.f577api

sealed class State660_10 {
    data object Loading : State660_10()
    data class Success(val data: String) : State660_10()
    data class Error(val message: String) : State660_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
