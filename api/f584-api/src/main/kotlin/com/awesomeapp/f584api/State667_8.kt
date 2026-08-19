package com.awesomeapp.f584api

sealed class State667_8 {
    data object Loading : State667_8()
    data class Success(val data: String) : State667_8()
    data class Error(val message: String) : State667_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
