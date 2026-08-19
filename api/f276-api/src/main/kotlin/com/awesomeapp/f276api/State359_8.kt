package com.awesomeapp.f276api

sealed class State359_8 {
    data object Loading : State359_8()
    data class Success(val data: String) : State359_8()
    data class Error(val message: String) : State359_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
