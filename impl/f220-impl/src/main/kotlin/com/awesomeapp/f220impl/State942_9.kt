package com.awesomeapp.f220impl

sealed class State942_9 {
    data object Loading : State942_9()
    data class Success(val data: String) : State942_9()
    data class Error(val message: String) : State942_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
