package com.awesomeapp.f572impl

sealed class State1294_5 {
    data object Loading : State1294_5()
    data class Success(val data: String) : State1294_5()
    data class Error(val message: String) : State1294_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
