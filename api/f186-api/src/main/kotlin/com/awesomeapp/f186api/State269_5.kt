package com.awesomeapp.f186api

sealed class State269_5 {
    data object Loading : State269_5()
    data class Success(val data: String) : State269_5()
    data class Error(val message: String) : State269_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
