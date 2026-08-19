package com.awesomeapp.f410api

sealed class State493_5 {
    data object Loading : State493_5()
    data class Success(val data: String) : State493_5()
    data class Error(val message: String) : State493_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
