package com.awesomeapp.f471api

sealed class State554_5 {
    data object Loading : State554_5()
    data class Success(val data: String) : State554_5()
    data class Error(val message: String) : State554_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
