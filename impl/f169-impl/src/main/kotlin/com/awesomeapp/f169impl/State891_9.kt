package com.awesomeapp.f169impl

sealed class State891_9 {
    data object Loading : State891_9()
    data class Success(val data: String) : State891_9()
    data class Error(val message: String) : State891_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
