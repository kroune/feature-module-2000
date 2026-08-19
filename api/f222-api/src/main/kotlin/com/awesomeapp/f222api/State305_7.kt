package com.awesomeapp.f222api

sealed class State305_7 {
    data object Loading : State305_7()
    data class Success(val data: String) : State305_7()
    data class Error(val message: String) : State305_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
