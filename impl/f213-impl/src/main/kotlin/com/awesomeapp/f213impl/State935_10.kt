package com.awesomeapp.f213impl

sealed class State935_10 {
    data object Loading : State935_10()
    data class Success(val data: String) : State935_10()
    data class Error(val message: String) : State935_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
