package com.awesomeapp.f446api

sealed class State529_5 {
    data object Loading : State529_5()
    data class Success(val data: String) : State529_5()
    data class Error(val message: String) : State529_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
