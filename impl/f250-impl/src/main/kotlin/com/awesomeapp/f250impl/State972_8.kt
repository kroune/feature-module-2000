package com.awesomeapp.f250impl

sealed class State972_8 {
    data object Loading : State972_8()
    data class Success(val data: String) : State972_8()
    data class Error(val message: String) : State972_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
