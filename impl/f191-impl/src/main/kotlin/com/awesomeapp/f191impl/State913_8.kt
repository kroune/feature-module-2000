package com.awesomeapp.f191impl

sealed class State913_8 {
    data object Loading : State913_8()
    data class Success(val data: String) : State913_8()
    data class Error(val message: String) : State913_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
