package com.awesomeapp.f286api

sealed class State369_6 {
    data object Loading : State369_6()
    data class Success(val data: String) : State369_6()
    data class Error(val message: String) : State369_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
