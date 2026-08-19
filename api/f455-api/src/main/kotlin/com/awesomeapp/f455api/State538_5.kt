package com.awesomeapp.f455api

sealed class State538_5 {
    data object Loading : State538_5()
    data class Success(val data: String) : State538_5()
    data class Error(val message: String) : State538_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
