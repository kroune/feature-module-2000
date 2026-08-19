package com.awesomeapp.f271impl

sealed class State993_6 {
    data object Loading : State993_6()
    data class Success(val data: String) : State993_6()
    data class Error(val message: String) : State993_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
