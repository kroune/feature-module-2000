package com.awesomeapp.f466api

sealed class State549_6 {
    data object Loading : State549_6()
    data class Success(val data: String) : State549_6()
    data class Error(val message: String) : State549_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
