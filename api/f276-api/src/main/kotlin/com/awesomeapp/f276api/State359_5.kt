package com.awesomeapp.f276api

sealed class State359_5 {
    data object Loading : State359_5()
    data class Success(val data: String) : State359_5()
    data class Error(val message: String) : State359_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
