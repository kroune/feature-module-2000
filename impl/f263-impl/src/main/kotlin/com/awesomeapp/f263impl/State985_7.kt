package com.awesomeapp.f263impl

sealed class State985_7 {
    data object Loading : State985_7()
    data class Success(val data: String) : State985_7()
    data class Error(val message: String) : State985_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
