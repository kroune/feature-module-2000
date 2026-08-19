package com.awesomeapp.f409api

sealed class State492_8 {
    data object Loading : State492_8()
    data class Success(val data: String) : State492_8()
    data class Error(val message: String) : State492_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
