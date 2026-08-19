package com.awesomeapp.f50ui

sealed class State1411_8 {
    data object Loading : State1411_8()
    data class Success(val data: String) : State1411_8()
    data class Error(val message: String) : State1411_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
