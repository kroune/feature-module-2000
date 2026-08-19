package com.awesomeapp.f93impl

sealed class State815_7 {
    data object Loading : State815_7()
    data class Success(val data: String) : State815_7()
    data class Error(val message: String) : State815_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
