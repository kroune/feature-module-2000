package com.awesomeapp.f415api

sealed class State498_6 {
    data object Loading : State498_6()
    data class Success(val data: String) : State498_6()
    data class Error(val message: String) : State498_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
