package com.awesomeapp.f612api

sealed class State695_7 {
    data object Loading : State695_7()
    data class Success(val data: String) : State695_7()
    data class Error(val message: String) : State695_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
