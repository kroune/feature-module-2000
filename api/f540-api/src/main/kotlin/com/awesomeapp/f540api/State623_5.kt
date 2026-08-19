package com.awesomeapp.f540api

sealed class State623_5 {
    data object Loading : State623_5()
    data class Success(val data: String) : State623_5()
    data class Error(val message: String) : State623_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
