package com.awesomeapp.f104impl

sealed class State826_8 {
    data object Loading : State826_8()
    data class Success(val data: String) : State826_8()
    data class Error(val message: String) : State826_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
