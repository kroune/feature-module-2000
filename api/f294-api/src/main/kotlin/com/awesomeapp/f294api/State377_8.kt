package com.awesomeapp.f294api

sealed class State377_8 {
    data object Loading : State377_8()
    data class Success(val data: String) : State377_8()
    data class Error(val message: String) : State377_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
