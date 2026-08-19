package com.awesomeapp.f559impl

sealed class State1281_9 {
    data object Loading : State1281_9()
    data class Success(val data: String) : State1281_9()
    data class Error(val message: String) : State1281_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
