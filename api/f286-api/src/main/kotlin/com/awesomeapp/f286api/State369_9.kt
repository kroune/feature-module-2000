package com.awesomeapp.f286api

sealed class State369_9 {
    data object Loading : State369_9()
    data class Success(val data: String) : State369_9()
    data class Error(val message: String) : State369_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
