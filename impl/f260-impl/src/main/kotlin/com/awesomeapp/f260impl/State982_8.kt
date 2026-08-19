package com.awesomeapp.f260impl

sealed class State982_8 {
    data object Loading : State982_8()
    data class Success(val data: String) : State982_8()
    data class Error(val message: String) : State982_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
