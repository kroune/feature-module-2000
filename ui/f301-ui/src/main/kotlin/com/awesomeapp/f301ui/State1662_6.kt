package com.awesomeapp.f301ui

sealed class State1662_6 {
    data object Loading : State1662_6()
    data class Success(val data: String) : State1662_6()
    data class Error(val message: String) : State1662_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
