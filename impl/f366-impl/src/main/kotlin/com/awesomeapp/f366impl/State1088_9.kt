package com.awesomeapp.f366impl

sealed class State1088_9 {
    data object Loading : State1088_9()
    data class Success(val data: String) : State1088_9()
    data class Error(val message: String) : State1088_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
