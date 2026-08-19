package com.awesomeapp.f5ui

sealed class State1366_8 {
    data object Loading : State1366_8()
    data class Success(val data: String) : State1366_8()
    data class Error(val message: String) : State1366_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
