package com.awesomeapp.f52impl

sealed class State774_9 {
    data object Loading : State774_9()
    data class Success(val data: String) : State774_9()
    data class Error(val message: String) : State774_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
