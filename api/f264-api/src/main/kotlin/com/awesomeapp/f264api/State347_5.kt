package com.awesomeapp.f264api

sealed class State347_5 {
    data object Loading : State347_5()
    data class Success(val data: String) : State347_5()
    data class Error(val message: String) : State347_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
