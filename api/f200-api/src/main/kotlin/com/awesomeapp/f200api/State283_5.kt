package com.awesomeapp.f200api

sealed class State283_5 {
    data object Loading : State283_5()
    data class Success(val data: String) : State283_5()
    data class Error(val message: String) : State283_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
