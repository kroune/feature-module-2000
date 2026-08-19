package com.awesomeapp.f262impl

sealed class State984_8 {
    data object Loading : State984_8()
    data class Success(val data: String) : State984_8()
    data class Error(val message: String) : State984_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
