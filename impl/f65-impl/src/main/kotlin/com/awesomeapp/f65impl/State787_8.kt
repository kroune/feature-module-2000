package com.awesomeapp.f65impl

sealed class State787_8 {
    data object Loading : State787_8()
    data class Success(val data: String) : State787_8()
    data class Error(val message: String) : State787_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
