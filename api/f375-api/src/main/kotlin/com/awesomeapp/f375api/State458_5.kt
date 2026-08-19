package com.awesomeapp.f375api

sealed class State458_5 {
    data object Loading : State458_5()
    data class Success(val data: String) : State458_5()
    data class Error(val message: String) : State458_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
