package com.awesomeapp.f89impl

sealed class State811_8 {
    data object Loading : State811_8()
    data class Success(val data: String) : State811_8()
    data class Error(val message: String) : State811_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
