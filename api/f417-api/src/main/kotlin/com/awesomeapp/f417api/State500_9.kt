package com.awesomeapp.f417api

sealed class State500_9 {
    data object Loading : State500_9()
    data class Success(val data: String) : State500_9()
    data class Error(val message: String) : State500_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
