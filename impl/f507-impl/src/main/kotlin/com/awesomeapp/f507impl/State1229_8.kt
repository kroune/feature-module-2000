package com.awesomeapp.f507impl

sealed class State1229_8 {
    data object Loading : State1229_8()
    data class Success(val data: String) : State1229_8()
    data class Error(val message: String) : State1229_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
