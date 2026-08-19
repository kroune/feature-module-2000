package com.awesomeapp.f390api

sealed class State473_5 {
    data object Loading : State473_5()
    data class Success(val data: String) : State473_5()
    data class Error(val message: String) : State473_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
