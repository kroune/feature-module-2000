package com.awesomeapp.f545api

sealed class State628_10 {
    data object Loading : State628_10()
    data class Success(val data: String) : State628_10()
    data class Error(val message: String) : State628_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
