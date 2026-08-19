package com.awesomeapp.f224api

sealed class State307_5 {
    data object Loading : State307_5()
    data class Success(val data: String) : State307_5()
    data class Error(val message: String) : State307_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
