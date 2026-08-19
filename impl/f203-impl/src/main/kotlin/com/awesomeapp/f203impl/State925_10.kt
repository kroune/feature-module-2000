package com.awesomeapp.f203impl

sealed class State925_10 {
    data object Loading : State925_10()
    data class Success(val data: String) : State925_10()
    data class Error(val message: String) : State925_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
