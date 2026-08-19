package com.awesomeapp.f580api

sealed class State663_6 {
    data object Loading : State663_6()
    data class Success(val data: String) : State663_6()
    data class Error(val message: String) : State663_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
