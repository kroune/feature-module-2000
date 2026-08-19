package com.awesomeapp.f95impl

sealed class State817_5 {
    data object Loading : State817_5()
    data class Success(val data: String) : State817_5()
    data class Error(val message: String) : State817_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
