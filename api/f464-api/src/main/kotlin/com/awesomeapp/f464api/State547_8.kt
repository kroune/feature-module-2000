package com.awesomeapp.f464api

sealed class State547_8 {
    data object Loading : State547_8()
    data class Success(val data: String) : State547_8()
    data class Error(val message: String) : State547_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
