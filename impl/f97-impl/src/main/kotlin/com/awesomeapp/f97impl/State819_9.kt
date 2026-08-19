package com.awesomeapp.f97impl

sealed class State819_9 {
    data object Loading : State819_9()
    data class Success(val data: String) : State819_9()
    data class Error(val message: String) : State819_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
