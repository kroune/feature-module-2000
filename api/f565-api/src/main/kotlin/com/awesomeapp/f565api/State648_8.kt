package com.awesomeapp.f565api

sealed class State648_8 {
    data object Loading : State648_8()
    data class Success(val data: String) : State648_8()
    data class Error(val message: String) : State648_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
