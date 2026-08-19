package com.awesomeapp.f194impl

sealed class State916_7 {
    data object Loading : State916_7()
    data class Success(val data: String) : State916_7()
    data class Error(val message: String) : State916_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
