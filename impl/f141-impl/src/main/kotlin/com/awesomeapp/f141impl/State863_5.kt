package com.awesomeapp.f141impl

sealed class State863_5 {
    data object Loading : State863_5()
    data class Success(val data: String) : State863_5()
    data class Error(val message: String) : State863_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
