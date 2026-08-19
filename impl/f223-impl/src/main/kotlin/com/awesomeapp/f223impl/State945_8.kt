package com.awesomeapp.f223impl

sealed class State945_8 {
    data object Loading : State945_8()
    data class Success(val data: String) : State945_8()
    data class Error(val message: String) : State945_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
