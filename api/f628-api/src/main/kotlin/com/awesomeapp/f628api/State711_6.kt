package com.awesomeapp.f628api

sealed class State711_6 {
    data object Loading : State711_6()
    data class Success(val data: String) : State711_6()
    data class Error(val message: String) : State711_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
