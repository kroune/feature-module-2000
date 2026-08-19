package com.awesomeapp.f359api

sealed class State442_5 {
    data object Loading : State442_5()
    data class Success(val data: String) : State442_5()
    data class Error(val message: String) : State442_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
