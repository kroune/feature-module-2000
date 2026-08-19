package com.awesomeapp.f589api

sealed class State672_8 {
    data object Loading : State672_8()
    data class Success(val data: String) : State672_8()
    data class Error(val message: String) : State672_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
