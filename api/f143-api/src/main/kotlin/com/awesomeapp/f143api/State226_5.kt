package com.awesomeapp.f143api

sealed class State226_5 {
    data object Loading : State226_5()
    data class Success(val data: String) : State226_5()
    data class Error(val message: String) : State226_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
