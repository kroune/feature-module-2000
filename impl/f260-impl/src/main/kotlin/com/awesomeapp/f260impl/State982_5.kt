package com.awesomeapp.f260impl

sealed class State982_5 {
    data object Loading : State982_5()
    data class Success(val data: String) : State982_5()
    data class Error(val message: String) : State982_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
