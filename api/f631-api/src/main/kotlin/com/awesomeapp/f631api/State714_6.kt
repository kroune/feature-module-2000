package com.awesomeapp.f631api

sealed class State714_6 {
    data object Loading : State714_6()
    data class Success(val data: String) : State714_6()
    data class Error(val message: String) : State714_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
