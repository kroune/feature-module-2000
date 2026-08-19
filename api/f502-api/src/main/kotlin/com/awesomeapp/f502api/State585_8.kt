package com.awesomeapp.f502api

sealed class State585_8 {
    data object Loading : State585_8()
    data class Success(val data: String) : State585_8()
    data class Error(val message: String) : State585_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
