package com.awesomeapp.f175api

sealed class State258_6 {
    data object Loading : State258_6()
    data class Success(val data: String) : State258_6()
    data class Error(val message: String) : State258_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
