package com.awesomeapp.f536impl

sealed class State1258_5 {
    data object Loading : State1258_5()
    data class Success(val data: String) : State1258_5()
    data class Error(val message: String) : State1258_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
