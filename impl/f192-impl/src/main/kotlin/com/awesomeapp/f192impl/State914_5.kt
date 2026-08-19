package com.awesomeapp.f192impl

sealed class State914_5 {
    data object Loading : State914_5()
    data class Success(val data: String) : State914_5()
    data class Error(val message: String) : State914_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
