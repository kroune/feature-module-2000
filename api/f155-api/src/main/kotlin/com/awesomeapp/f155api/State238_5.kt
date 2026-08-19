package com.awesomeapp.f155api

sealed class State238_5 {
    data object Loading : State238_5()
    data class Success(val data: String) : State238_5()
    data class Error(val message: String) : State238_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
