package com.awesomeapp.f586impl

sealed class State1308_7 {
    data object Loading : State1308_7()
    data class Success(val data: String) : State1308_7()
    data class Error(val message: String) : State1308_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
