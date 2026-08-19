package com.awesomeapp.f307ui

sealed class State1668_7 {
    data object Loading : State1668_7()
    data class Success(val data: String) : State1668_7()
    data class Error(val message: String) : State1668_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
