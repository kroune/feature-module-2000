package com.awesomeapp.f609impl

sealed class State1331_5 {
    data object Loading : State1331_5()
    data class Success(val data: String) : State1331_5()
    data class Error(val message: String) : State1331_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
