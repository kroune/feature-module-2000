package com.awesomeapp.f341api

sealed class State424_7 {
    data object Loading : State424_7()
    data class Success(val data: String) : State424_7()
    data class Error(val message: String) : State424_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
