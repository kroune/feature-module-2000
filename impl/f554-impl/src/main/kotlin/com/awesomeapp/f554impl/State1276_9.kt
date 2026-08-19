package com.awesomeapp.f554impl

sealed class State1276_9 {
    data object Loading : State1276_9()
    data class Success(val data: String) : State1276_9()
    data class Error(val message: String) : State1276_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
