package com.awesomeapp.f303api

sealed class State386_5 {
    data object Loading : State386_5()
    data class Success(val data: String) : State386_5()
    data class Error(val message: String) : State386_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
