package com.awesomeapp.f246impl

sealed class State968_10 {
    data object Loading : State968_10()
    data class Success(val data: String) : State968_10()
    data class Error(val message: String) : State968_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
