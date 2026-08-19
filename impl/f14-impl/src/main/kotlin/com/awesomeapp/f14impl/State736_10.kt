package com.awesomeapp.f14impl

sealed class State736_10 {
    data object Loading : State736_10()
    data class Success(val data: String) : State736_10()
    data class Error(val message: String) : State736_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
