package com.awesomeapp.f360impl

sealed class State1082_8 {
    data object Loading : State1082_8()
    data class Success(val data: String) : State1082_8()
    data class Error(val message: String) : State1082_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
