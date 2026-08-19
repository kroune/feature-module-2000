package com.awesomeapp.f544api

sealed class State627_6 {
    data object Loading : State627_6()
    data class Success(val data: String) : State627_6()
    data class Error(val message: String) : State627_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
