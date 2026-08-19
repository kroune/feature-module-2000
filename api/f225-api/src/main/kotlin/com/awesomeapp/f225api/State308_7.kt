package com.awesomeapp.f225api

sealed class State308_7 {
    data object Loading : State308_7()
    data class Success(val data: String) : State308_7()
    data class Error(val message: String) : State308_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
