package com.awesomeapp.f550api

sealed class State633_9 {
    data object Loading : State633_9()
    data class Success(val data: String) : State633_9()
    data class Error(val message: String) : State633_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
