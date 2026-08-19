package com.awesomeapp.f334api

sealed class State417_6 {
    data object Loading : State417_6()
    data class Success(val data: String) : State417_6()
    data class Error(val message: String) : State417_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
