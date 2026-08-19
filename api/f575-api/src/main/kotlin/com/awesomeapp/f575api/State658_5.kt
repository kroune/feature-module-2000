package com.awesomeapp.f575api

sealed class State658_5 {
    data object Loading : State658_5()
    data class Success(val data: String) : State658_5()
    data class Error(val message: String) : State658_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
