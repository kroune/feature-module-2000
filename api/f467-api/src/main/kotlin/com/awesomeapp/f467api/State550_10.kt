package com.awesomeapp.f467api

sealed class State550_10 {
    data object Loading : State550_10()
    data class Success(val data: String) : State550_10()
    data class Error(val message: String) : State550_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
