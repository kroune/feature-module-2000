package com.awesomeapp.f232impl

sealed class State954_6 {
    data object Loading : State954_6()
    data class Success(val data: String) : State954_6()
    data class Error(val message: String) : State954_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
