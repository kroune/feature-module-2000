package com.awesomeapp.f374api

sealed class State457_5 {
    data object Loading : State457_5()
    data class Success(val data: String) : State457_5()
    data class Error(val message: String) : State457_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
