package com.awesomeapp.f191api

sealed class State274_8 {
    data object Loading : State274_8()
    data class Success(val data: String) : State274_8()
    data class Error(val message: String) : State274_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
