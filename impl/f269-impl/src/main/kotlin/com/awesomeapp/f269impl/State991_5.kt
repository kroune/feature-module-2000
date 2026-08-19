package com.awesomeapp.f269impl

sealed class State991_5 {
    data object Loading : State991_5()
    data class Success(val data: String) : State991_5()
    data class Error(val message: String) : State991_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
