package com.awesomeapp.f453api

sealed class State536_10 {
    data object Loading : State536_10()
    data class Success(val data: String) : State536_10()
    data class Error(val message: String) : State536_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
