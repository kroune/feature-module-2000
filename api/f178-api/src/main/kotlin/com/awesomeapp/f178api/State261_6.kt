package com.awesomeapp.f178api

sealed class State261_6 {
    data object Loading : State261_6()
    data class Success(val data: String) : State261_6()
    data class Error(val message: String) : State261_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
