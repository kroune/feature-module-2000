package com.awesomeapp.f265impl

sealed class State987_9 {
    data object Loading : State987_9()
    data class Success(val data: String) : State987_9()
    data class Error(val message: String) : State987_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
