package com.awesomeapp.f579api

sealed class State662_5 {
    data object Loading : State662_5()
    data class Success(val data: String) : State662_5()
    data class Error(val message: String) : State662_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
