package com.awesomeapp.f568impl

sealed class State1290_8 {
    data object Loading : State1290_8()
    data class Success(val data: String) : State1290_8()
    data class Error(val message: String) : State1290_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
