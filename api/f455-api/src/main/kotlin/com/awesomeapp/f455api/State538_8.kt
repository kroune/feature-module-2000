package com.awesomeapp.f455api

sealed class State538_8 {
    data object Loading : State538_8()
    data class Success(val data: String) : State538_8()
    data class Error(val message: String) : State538_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
