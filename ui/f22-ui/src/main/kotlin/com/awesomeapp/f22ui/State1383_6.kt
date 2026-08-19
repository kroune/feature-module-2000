package com.awesomeapp.f22ui

sealed class State1383_6 {
    data object Loading : State1383_6()
    data class Success(val data: String) : State1383_6()
    data class Error(val message: String) : State1383_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
