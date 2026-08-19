package com.awesomeapp.f629impl

sealed class State1351_8 {
    data object Loading : State1351_8()
    data class Success(val data: String) : State1351_8()
    data class Error(val message: String) : State1351_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
