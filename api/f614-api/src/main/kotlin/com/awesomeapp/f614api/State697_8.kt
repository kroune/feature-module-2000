package com.awesomeapp.f614api

sealed class State697_8 {
    data object Loading : State697_8()
    data class Success(val data: String) : State697_8()
    data class Error(val message: String) : State697_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
