package com.awesomeapp.f468impl

sealed class State1190_7 {
    data object Loading : State1190_7()
    data class Success(val data: String) : State1190_7()
    data class Error(val message: String) : State1190_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
