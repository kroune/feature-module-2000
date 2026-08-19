package com.awesomeapp.f476api

sealed class State559_8 {
    data object Loading : State559_8()
    data class Success(val data: String) : State559_8()
    data class Error(val message: String) : State559_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
