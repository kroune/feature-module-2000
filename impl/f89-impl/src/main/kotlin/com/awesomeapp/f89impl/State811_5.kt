package com.awesomeapp.f89impl

sealed class State811_5 {
    data object Loading : State811_5()
    data class Success(val data: String) : State811_5()
    data class Error(val message: String) : State811_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
