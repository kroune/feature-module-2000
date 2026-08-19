package com.awesomeapp.f367impl

sealed class State1089_9 {
    data object Loading : State1089_9()
    data class Success(val data: String) : State1089_9()
    data class Error(val message: String) : State1089_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
