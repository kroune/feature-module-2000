package com.awesomeapp.f531ui

sealed class State1892_6 {
    data object Loading : State1892_6()
    data class Success(val data: String) : State1892_6()
    data class Error(val message: String) : State1892_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
