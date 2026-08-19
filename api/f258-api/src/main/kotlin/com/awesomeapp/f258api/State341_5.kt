package com.awesomeapp.f258api

sealed class State341_5 {
    data object Loading : State341_5()
    data class Success(val data: String) : State341_5()
    data class Error(val message: String) : State341_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
