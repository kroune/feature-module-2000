package com.awesomeapp.f163api

sealed class State246_6 {
    data object Loading : State246_6()
    data class Success(val data: String) : State246_6()
    data class Error(val message: String) : State246_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
