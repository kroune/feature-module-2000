package com.awesomeapp.f411api

sealed class State494_5 {
    data object Loading : State494_5()
    data class Success(val data: String) : State494_5()
    data class Error(val message: String) : State494_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
