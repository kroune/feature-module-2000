package com.awesomeapp.f305api

sealed class State388_7 {
    data object Loading : State388_7()
    data class Success(val data: String) : State388_7()
    data class Error(val message: String) : State388_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
