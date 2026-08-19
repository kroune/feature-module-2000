package com.awesomeapp.f146api

sealed class State229_5 {
    data object Loading : State229_5()
    data class Success(val data: String) : State229_5()
    data class Error(val message: String) : State229_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
