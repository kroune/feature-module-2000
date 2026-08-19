package com.awesomeapp.f468api

sealed class State551_5 {
    data object Loading : State551_5()
    data class Success(val data: String) : State551_5()
    data class Error(val message: String) : State551_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
