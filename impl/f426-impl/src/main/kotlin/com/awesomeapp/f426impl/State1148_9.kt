package com.awesomeapp.f426impl

sealed class State1148_9 {
    data object Loading : State1148_9()
    data class Success(val data: String) : State1148_9()
    data class Error(val message: String) : State1148_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
