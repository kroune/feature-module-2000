package com.awesomeapp.f620api

sealed class State703_8 {
    data object Loading : State703_8()
    data class Success(val data: String) : State703_8()
    data class Error(val message: String) : State703_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
