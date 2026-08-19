package com.awesomeapp.f53impl

sealed class State775_10 {
    data object Loading : State775_10()
    data class Success(val data: String) : State775_10()
    data class Error(val message: String) : State775_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
