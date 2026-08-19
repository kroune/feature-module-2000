package com.awesomeapp.f201ui

sealed class State1562_8 {
    data object Loading : State1562_8()
    data class Success(val data: String) : State1562_8()
    data class Error(val message: String) : State1562_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
