package com.awesomeapp.f265impl

sealed class State987_6 {
    data object Loading : State987_6()
    data class Success(val data: String) : State987_6()
    data class Error(val message: String) : State987_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
