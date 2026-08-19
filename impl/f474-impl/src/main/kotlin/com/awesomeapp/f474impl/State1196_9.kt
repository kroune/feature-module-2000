package com.awesomeapp.f474impl

sealed class State1196_9 {
    data object Loading : State1196_9()
    data class Success(val data: String) : State1196_9()
    data class Error(val message: String) : State1196_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
