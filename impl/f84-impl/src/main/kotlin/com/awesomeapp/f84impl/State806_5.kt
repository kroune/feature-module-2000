package com.awesomeapp.f84impl

sealed class State806_5 {
    data object Loading : State806_5()
    data class Success(val data: String) : State806_5()
    data class Error(val message: String) : State806_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
