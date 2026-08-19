package com.awesomeapp.f41impl

sealed class State763_8 {
    data object Loading : State763_8()
    data class Success(val data: String) : State763_8()
    data class Error(val message: String) : State763_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
