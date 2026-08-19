package com.awesomeapp.f294api

sealed class State377_5 {
    data object Loading : State377_5()
    data class Success(val data: String) : State377_5()
    data class Error(val message: String) : State377_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
