package com.awesomeapp.f386api

sealed class State469_8 {
    data object Loading : State469_8()
    data class Success(val data: String) : State469_8()
    data class Error(val message: String) : State469_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
