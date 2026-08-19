package com.awesomeapp.f106impl

sealed class State828_8 {
    data object Loading : State828_8()
    data class Success(val data: String) : State828_8()
    data class Error(val message: String) : State828_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
