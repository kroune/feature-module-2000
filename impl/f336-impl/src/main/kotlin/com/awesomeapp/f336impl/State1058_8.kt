package com.awesomeapp.f336impl

sealed class State1058_8 {
    data object Loading : State1058_8()
    data class Success(val data: String) : State1058_8()
    data class Error(val message: String) : State1058_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
