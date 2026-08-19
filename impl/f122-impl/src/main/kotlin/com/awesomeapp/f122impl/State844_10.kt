package com.awesomeapp.f122impl

sealed class State844_10 {
    data object Loading : State844_10()
    data class Success(val data: String) : State844_10()
    data class Error(val message: String) : State844_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
