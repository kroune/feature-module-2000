package com.awesomeapp.f234api

sealed class State317_5 {
    data object Loading : State317_5()
    data class Success(val data: String) : State317_5()
    data class Error(val message: String) : State317_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
