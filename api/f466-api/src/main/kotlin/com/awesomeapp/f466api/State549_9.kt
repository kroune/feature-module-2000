package com.awesomeapp.f466api

sealed class State549_9 {
    data object Loading : State549_9()
    data class Success(val data: String) : State549_9()
    data class Error(val message: String) : State549_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
