package com.awesomeapp.f419api

sealed class State502_5 {
    data object Loading : State502_5()
    data class Success(val data: String) : State502_5()
    data class Error(val message: String) : State502_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
