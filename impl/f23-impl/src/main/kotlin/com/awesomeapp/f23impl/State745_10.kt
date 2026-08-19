package com.awesomeapp.f23impl

sealed class State745_10 {
    data object Loading : State745_10()
    data class Success(val data: String) : State745_10()
    data class Error(val message: String) : State745_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
