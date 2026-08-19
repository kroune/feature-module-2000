package com.awesomeapp.f534api

sealed class State617_5 {
    data object Loading : State617_5()
    data class Success(val data: String) : State617_5()
    data class Error(val message: String) : State617_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
