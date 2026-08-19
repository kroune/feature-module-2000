package com.awesomeapp.f315impl

sealed class State1037_5 {
    data object Loading : State1037_5()
    data class Success(val data: String) : State1037_5()
    data class Error(val message: String) : State1037_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
