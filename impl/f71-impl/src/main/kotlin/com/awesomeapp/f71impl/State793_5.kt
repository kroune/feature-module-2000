package com.awesomeapp.f71impl

sealed class State793_5 {
    data object Loading : State793_5()
    data class Success(val data: String) : State793_5()
    data class Error(val message: String) : State793_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
