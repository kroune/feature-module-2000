package com.awesomeapp.f540api

sealed class State623_8 {
    data object Loading : State623_8()
    data class Success(val data: String) : State623_8()
    data class Error(val message: String) : State623_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
