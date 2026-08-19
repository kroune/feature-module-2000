package com.awesomeapp.f318api

sealed class State401_5 {
    data object Loading : State401_5()
    data class Success(val data: String) : State401_5()
    data class Error(val message: String) : State401_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
