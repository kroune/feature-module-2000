package com.awesomeapp.f368impl

sealed class State1090_7 {
    data object Loading : State1090_7()
    data class Success(val data: String) : State1090_7()
    data class Error(val message: String) : State1090_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
