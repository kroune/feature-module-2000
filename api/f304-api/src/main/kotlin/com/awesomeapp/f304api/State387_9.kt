package com.awesomeapp.f304api

sealed class State387_9 {
    data object Loading : State387_9()
    data class Success(val data: String) : State387_9()
    data class Error(val message: String) : State387_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
