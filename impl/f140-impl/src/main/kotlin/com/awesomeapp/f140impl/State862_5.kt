package com.awesomeapp.f140impl

sealed class State862_5 {
    data object Loading : State862_5()
    data class Success(val data: String) : State862_5()
    data class Error(val message: String) : State862_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
