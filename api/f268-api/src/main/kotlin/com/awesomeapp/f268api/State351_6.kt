package com.awesomeapp.f268api

sealed class State351_6 {
    data object Loading : State351_6()
    data class Success(val data: String) : State351_6()
    data class Error(val message: String) : State351_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
