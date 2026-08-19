package com.awesomeapp.f176api

sealed class State259_5 {
    data object Loading : State259_5()
    data class Success(val data: String) : State259_5()
    data class Error(val message: String) : State259_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
