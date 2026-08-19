package com.awesomeapp.f244impl

sealed class State966_6 {
    data object Loading : State966_6()
    data class Success(val data: String) : State966_6()
    data class Error(val message: String) : State966_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
