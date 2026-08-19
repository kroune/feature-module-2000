package com.awesomeapp.f499impl

sealed class State1221_6 {
    data object Loading : State1221_6()
    data class Success(val data: String) : State1221_6()
    data class Error(val message: String) : State1221_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
