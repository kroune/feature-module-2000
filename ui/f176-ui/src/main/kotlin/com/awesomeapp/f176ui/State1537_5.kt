package com.awesomeapp.f176ui

sealed class State1537_5 {
    data object Loading : State1537_5()
    data class Success(val data: String) : State1537_5()
    data class Error(val message: String) : State1537_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
