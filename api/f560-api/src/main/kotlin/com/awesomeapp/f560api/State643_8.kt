package com.awesomeapp.f560api

sealed class State643_8 {
    data object Loading : State643_8()
    data class Success(val data: String) : State643_8()
    data class Error(val message: String) : State643_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
