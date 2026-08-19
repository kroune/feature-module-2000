package com.awesomeapp.f488api

sealed class State571_5 {
    data object Loading : State571_5()
    data class Success(val data: String) : State571_5()
    data class Error(val message: String) : State571_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
