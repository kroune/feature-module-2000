package com.awesomeapp.f342api

sealed class State425_7 {
    data object Loading : State425_7()
    data class Success(val data: String) : State425_7()
    data class Error(val message: String) : State425_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
