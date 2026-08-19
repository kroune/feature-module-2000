package com.awesomeapp.f414api

sealed class State497_8 {
    data object Loading : State497_8()
    data class Success(val data: String) : State497_8()
    data class Error(val message: String) : State497_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
