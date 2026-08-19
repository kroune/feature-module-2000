package com.awesomeapp.f222impl

sealed class State944_7 {
    data object Loading : State944_7()
    data class Success(val data: String) : State944_7()
    data class Error(val message: String) : State944_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
