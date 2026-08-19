package com.awesomeapp.f406api

sealed class State489_6 {
    data object Loading : State489_6()
    data class Success(val data: String) : State489_6()
    data class Error(val message: String) : State489_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
