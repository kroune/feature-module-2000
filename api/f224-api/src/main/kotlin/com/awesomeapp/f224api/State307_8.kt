package com.awesomeapp.f224api

sealed class State307_8 {
    data object Loading : State307_8()
    data class Success(val data: String) : State307_8()
    data class Error(val message: String) : State307_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
