package com.awesomeapp.f320impl

sealed class State1042_5 {
    data object Loading : State1042_5()
    data class Success(val data: String) : State1042_5()
    data class Error(val message: String) : State1042_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
