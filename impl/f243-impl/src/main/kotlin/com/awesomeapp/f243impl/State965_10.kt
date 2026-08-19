package com.awesomeapp.f243impl

sealed class State965_10 {
    data object Loading : State965_10()
    data class Success(val data: String) : State965_10()
    data class Error(val message: String) : State965_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
