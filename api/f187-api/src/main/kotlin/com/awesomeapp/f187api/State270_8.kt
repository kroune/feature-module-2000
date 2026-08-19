package com.awesomeapp.f187api

sealed class State270_8 {
    data object Loading : State270_8()
    data class Success(val data: String) : State270_8()
    data class Error(val message: String) : State270_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
