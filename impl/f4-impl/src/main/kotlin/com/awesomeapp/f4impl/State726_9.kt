package com.awesomeapp.f4impl

sealed class State726_9 {
    data object Loading : State726_9()
    data class Success(val data: String) : State726_9()
    data class Error(val message: String) : State726_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
