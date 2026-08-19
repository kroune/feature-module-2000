package com.awesomeapp.f520api

sealed class State603_6 {
    data object Loading : State603_6()
    data class Success(val data: String) : State603_6()
    data class Error(val message: String) : State603_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
