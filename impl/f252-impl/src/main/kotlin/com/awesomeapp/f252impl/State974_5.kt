package com.awesomeapp.f252impl

sealed class State974_5 {
    data object Loading : State974_5()
    data class Success(val data: String) : State974_5()
    data class Error(val message: String) : State974_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
