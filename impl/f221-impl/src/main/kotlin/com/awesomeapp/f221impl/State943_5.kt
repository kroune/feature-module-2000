package com.awesomeapp.f221impl

sealed class State943_5 {
    data object Loading : State943_5()
    data class Success(val data: String) : State943_5()
    data class Error(val message: String) : State943_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
