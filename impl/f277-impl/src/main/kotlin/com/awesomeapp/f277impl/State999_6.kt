package com.awesomeapp.f277impl

sealed class State999_6 {
    data object Loading : State999_6()
    data class Success(val data: String) : State999_6()
    data class Error(val message: String) : State999_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
