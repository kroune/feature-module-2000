package com.awesomeapp.f215api

sealed class State298_5 {
    data object Loading : State298_5()
    data class Success(val data: String) : State298_5()
    data class Error(val message: String) : State298_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
