package com.awesomeapp.f65impl

sealed class State787_5 {
    data object Loading : State787_5()
    data class Success(val data: String) : State787_5()
    data class Error(val message: String) : State787_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
