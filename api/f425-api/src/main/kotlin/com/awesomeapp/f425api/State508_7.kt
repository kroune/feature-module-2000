package com.awesomeapp.f425api

sealed class State508_7 {
    data object Loading : State508_7()
    data class Success(val data: String) : State508_7()
    data class Error(val message: String) : State508_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
