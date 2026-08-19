package com.awesomeapp.f152api

sealed class State235_7 {
    data object Loading : State235_7()
    data class Success(val data: String) : State235_7()
    data class Error(val message: String) : State235_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
