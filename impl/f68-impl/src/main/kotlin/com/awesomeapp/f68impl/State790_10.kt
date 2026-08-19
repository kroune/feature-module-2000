package com.awesomeapp.f68impl

sealed class State790_10 {
    data object Loading : State790_10()
    data class Success(val data: String) : State790_10()
    data class Error(val message: String) : State790_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
