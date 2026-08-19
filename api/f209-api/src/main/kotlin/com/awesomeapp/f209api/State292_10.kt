package com.awesomeapp.f209api

sealed class State292_10 {
    data object Loading : State292_10()
    data class Success(val data: String) : State292_10()
    data class Error(val message: String) : State292_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
