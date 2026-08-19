package com.awesomeapp.f479api

sealed class State562_5 {
    data object Loading : State562_5()
    data class Success(val data: String) : State562_5()
    data class Error(val message: String) : State562_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
