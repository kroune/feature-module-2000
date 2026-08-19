package com.awesomeapp.f215api

sealed class State298_8 {
    data object Loading : State298_8()
    data class Success(val data: String) : State298_8()
    data class Error(val message: String) : State298_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
