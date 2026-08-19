package com.awesomeapp.f321api

sealed class State404_7 {
    data object Loading : State404_7()
    data class Success(val data: String) : State404_7()
    data class Error(val message: String) : State404_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
