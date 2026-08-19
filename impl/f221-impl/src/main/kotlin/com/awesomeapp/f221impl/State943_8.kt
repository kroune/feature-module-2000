package com.awesomeapp.f221impl

sealed class State943_8 {
    data object Loading : State943_8()
    data class Success(val data: String) : State943_8()
    data class Error(val message: String) : State943_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
