package com.awesomeapp.f284api

sealed class State367_5 {
    data object Loading : State367_5()
    data class Success(val data: String) : State367_5()
    data class Error(val message: String) : State367_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
