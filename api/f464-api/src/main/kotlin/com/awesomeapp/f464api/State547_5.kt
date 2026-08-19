package com.awesomeapp.f464api

sealed class State547_5 {
    data object Loading : State547_5()
    data class Success(val data: String) : State547_5()
    data class Error(val message: String) : State547_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
